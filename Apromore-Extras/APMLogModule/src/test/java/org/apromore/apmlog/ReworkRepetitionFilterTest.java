package org.apromore.apmlog;

import org.apromore.apmlog.APMLog;
import org.apromore.apmlog.APMLogUnitTest;
import org.apromore.apmlog.ATrace;
import org.apromore.apmlog.filter.APMLogFilter;
import org.apromore.apmlog.filter.rules.LogFilterRule;
import org.apromore.apmlog.filter.rules.LogFilterRuleImpl;
import org.apromore.apmlog.filter.rules.RuleValue;
import org.apromore.apmlog.filter.types.*;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import org.eclipse.collections.impl.set.mutable.UnifiedSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReworkRepetitionFilterTest {

    public static void testGreaterOnly(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.GREATER, "a", 1));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        expectedCaseIds.add("c1");
        expectedCaseIds.add("c3");
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    public static void testGreaterEqual(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.GREATER_EQUAL, "a", 2));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        expectedCaseIds.add("c1");
        expectedCaseIds.add("c3");
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    public static void testLessOnly(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.LESS, "a", 3));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        expectedCaseIds.add("c2");
        expectedCaseIds.add("c3");
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    public static void testLessEqual(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.LESS_EQUAL, "a", 2));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        expectedCaseIds.add("c2");
        expectedCaseIds.add("c3");
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    public static void testGreaterAndLessEqual(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.GREATER, "a", 0));
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.LESS_EQUAL, "a", 2));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        expectedCaseIds.add("c2");
        expectedCaseIds.add("c3");
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    public static void testLessEqual0(APMLog apmLog, APMLogUnitTest parent) throws Exception {
        Set<RuleValue> primaryValues = new HashSet<>();
        primaryValues.add(new RuleValue(FilterType.REWORK_REPETITION, OperationType.LESS_EQUAL, "a", 0));
        UnifiedSet<String> expectedCaseIds = new UnifiedSet<>();
        runTest(apmLog, parent, FilterType.REWORK_REPETITION, primaryValues, expectedCaseIds);
    }

    private static void runTest(APMLog apmLog, APMLogUnitTest parent, FilterType filterType,
                               Set<RuleValue> primaryValues,
                               UnifiedSet<String> expectedCaseIds) throws Exception {

        LogFilterRule logFilterRule = new LogFilterRuleImpl(Choice.RETAIN, Inclusion.ANY_VALUE, Section.CASE,
                filterType, "", primaryValues, null);

        List<LogFilterRule> rules = new ArrayList<>();
        rules.add(logFilterRule);

        APMLogFilter apmLogFilter = new APMLogFilter(apmLog);
        apmLogFilter.filter(rules);

        List<ATrace> traceList = apmLogFilter.getApmLog().getTraceList();

        UnifiedMap<String, Boolean> expectedIdMatch = new UnifiedMap<>();

        for (String caseId : expectedCaseIds) {
            expectedIdMatch.put(caseId, false);
        }

        UnifiedSet<String> resultCaseIds = new UnifiedSet<>();

        System.out.println("Trace size:" + traceList.size());

        for (ATrace trace : traceList) {
            System.out.println(trace.getCaseId());
            resultCaseIds.add(trace.getCaseId());
        }

        boolean allMatch = true;

        for (String caseId : resultCaseIds) {
            if (!expectedCaseIds.contains(caseId)) allMatch = false;
        }

        for (String caseId : expectedCaseIds) {
            if (!resultCaseIds.contains(caseId)) allMatch = false;
        }

        if (!allMatch) {
            throw new AssertionError("TEST FAILED. RESULT TRACE LIST MISMATCH.");
        } else {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (RuleValue rv : primaryValues) {
                sb.append(rv.getOperationType().toString());
                if (primaryValues.size() > 1 && count < primaryValues.size() - 1) {
                    sb.append(" + ");
                }
                count += 1;
            }
            parent.printString("'Rework & Repetition - "+sb+"' Test PASS.");
        }
    }
}

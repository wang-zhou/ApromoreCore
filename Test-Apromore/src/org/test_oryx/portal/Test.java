
package org.test_oryx.portal;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.util.ByteArrayDataSource;
import javax.xml.namespace.QName;

import org.test_oryx.model_portal.ReadNativeInputMsgType;
import org.test_oryx.model_portal.WriteAnnotationInputMsgType;
import org.test_oryx.model_portal.WriteAnnotationOutputMsgType;
import org.test_oryx.model_portal.WriteNewAnnotationInputMsgType;
import org.test_oryx.model_portal.WriteNewAnnotationOutputMsgType;
import org.test_oryx.model_portal.WriteNewProcessInputMsgType;
import org.test_oryx.model_portal.WriteNewProcessOutputMsgType;
import org.test_oryx.model_portal.WriteProcessInputMsgType;
import org.test_oryx.model_portal.WriteProcessOutputMsgType;

/**
 * This class was generated by Apache CXF 2.2.7
 * Thu Jun 24 15:47:42 EST 2010
 * Generated source version: 2.2.7
 * 
 */

public class Test {

	private static final QName SERVICE_NAME = new QName("http://www.apromore.org/portal/service_oryx", "PortalOryxService");
	private static PortalOryxPortType port;

	public Test() {

	}

	public static WriteProcessOutputMsgType 
	writeProcess (InputStream native_xml, int sessionCode, String preVersion) throws IOException {
		System.out.println("Invoking writeProcess...");
		WriteProcessInputMsgType payload = new WriteProcessInputMsgType();
		DataSource source = new ByteArrayDataSource(native_xml, "text/xml"); 
		payload.setNative(new DataHandler(source));
		payload.setEditSessionCode(sessionCode);
		payload.setPreVersion(preVersion);
		WriteProcessOutputMsgType res = port.writeProcess(payload);
		return res;
	}

	public static WriteNewProcessOutputMsgType 
	writeNewProcess(InputStream native_xml, int sessionCode, String processName, String versionName) throws IOException {
		System.out.println("Invoking writeNewProcess...");
		WriteNewProcessInputMsgType payload = new WriteNewProcessInputMsgType();
		DataSource source = new ByteArrayDataSource(native_xml, "text/xml"); 
		payload.setNative(new DataHandler(source));
		payload.setEditSessionCode(sessionCode);
		payload.setProcessName(processName);
		payload.setVersionName(versionName);
		WriteNewProcessOutputMsgType res = port.writeNewProcess(payload);
		return res;
	}

	public static void readNative() {
		System.out.println("Invoking readNative...");
		ReadNativeInputMsgType payload = new ReadNativeInputMsgType();
		payload.setEditSessionCode(0);
		org.test_oryx.model_portal.ReadNativeOutputMsgType _readNative__return = port.readNative(payload);
		System.out.println("readNative.result=" + _readNative__return);
	}

	public static void closeSession() {
		System.out.println("Invoking closeSession...");
		org.test_oryx.model_portal.CloseSessionInputMsgType _closeSession_payload = new org.test_oryx.model_portal.CloseSessionInputMsgType();
		_closeSession_payload.setCode(-935421539);
		org.test_oryx.model_portal.CloseSessionOutputMsgType _closeSession__return = port.closeSession(_closeSession_payload);
		System.out.println("closeSession.result=" + _closeSession__return);
	}

	public static WriteNewAnnotationOutputMsgType writeNewAnnotation(InputStream native_is, int sessionCode, String annotationName) 
	throws IOException { 
		System.out.println("Invoking WriteNewAnnotation");
		WriteNewAnnotationInputMsgType payload = new WriteNewAnnotationInputMsgType();
		WriteNewAnnotationOutputMsgType _return = new WriteNewAnnotationOutputMsgType();
		DataSource source = new ByteArrayDataSource(native_is, "text/xml"); 
		payload.setNative(new DataHandler(source));
		payload.setEditSessionCode(sessionCode);		
		payload.setAnnotationName(annotationName);
		return _return;
	}

	public static WriteAnnotationOutputMsgType writeAnnotation(InputStream native_is, int sessionCode) 
	throws IOException { 
		System.out.println("Invoking WriteAnnotation");
		WriteAnnotationInputMsgType payload = new WriteAnnotationInputMsgType();
		WriteAnnotationOutputMsgType _return = new WriteAnnotationOutputMsgType();
		DataSource source = new ByteArrayDataSource(native_is, "text/xml"); 
		payload.setNative(new DataHandler(source));
		payload.setEditSessionCode(sessionCode);	
		return _return;
	}

	public static void main(String[] args) throws IOException {

		URL wsdlURL = PortalOryxService.WSDL_LOCATION;
		PortalOryxService ss = new PortalOryxService(wsdlURL);
		port = ss.getPortalOryx(); 

		// values need to be checked with database
		// edit the process first to get session code...

		// test WriteProcess
		/*
		String versionName = "0.5";
		int sessionCode = 36;
		String file_path = "/coldplay/home/fauvet/models/test/mmmm-mcf.xpdl";
		File native_file = new File(file_path);
		InputStream native_is = new FileInputStream(native_file);

		WriteProcessOutputMsgType res1 = writeProcess(native_is, sessionCode, versionName);
		System.out.println (res1.getResult().getCode() + ", message: " + res1.getResult().getMessage());
		 */
		// test writeNewProcess
		/*
        String versionName = "0.5";
		int sessionCode = 36;
		String file_path = "/coldplay/home/fauvet/models/test/mmmm-mcf.xpdl";
		File native_file = new File(file_path);
		InputStream native_is = new FileInputStream(native_file);

		String processName = "mmmm-mcf11";
		WriteNewProcessOutputMsgType res2 = writeNewProcess(native_is, sessionCode, processName, versionName);
		System.out.println (res2.getResult().getCode() + ", message: " + res2.getResult().getMessage());
		System.out.println ("New edit session code: " + res2.getEditSessionCode());
		 */
		// test ReadNative

		// test WriteNewAnnotation
		int sessionCode = 36;
		String file_path = "/coldplay/home/fauvet/models/test/test.xpdl";
		File native_file = new File(file_path);
		InputStream native_is = new FileInputStream(native_file);
		String annotationName = "test";
		WriteNewAnnotationOutputMsgType res = writeNewAnnotation (native_is, sessionCode, annotationName);

		System.exit(0);
	}
}

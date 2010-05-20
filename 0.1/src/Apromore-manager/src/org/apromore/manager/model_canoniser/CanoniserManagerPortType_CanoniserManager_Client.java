
package org.apromore.manager.model_canoniser;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.7
 * Thu May 20 11:57:57 EST 2010
 * Generated source version: 2.2.7
 * 
 */

public final class CanoniserManagerPortType_CanoniserManager_Client {

    private static final QName SERVICE_NAME = new QName("http://www.apromore.org/canoniser/service_manager", "CanoniserManagerService");

    private CanoniserManagerPortType_CanoniserManager_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CanoniserManagerService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CanoniserManagerService ss = new CanoniserManagerService(wsdlURL, SERVICE_NAME);
        CanoniserManagerPortType port = ss.getCanoniserManager();  
        
        {
        System.out.println("Invoking canoniseProcess...");
        org.apromore.manager.model_canoniser.CanoniseProcessInputMsgType _canoniseProcess_payload = new org.apromore.manager.model_canoniser.CanoniseProcessInputMsgType();
        _canoniseProcess_payload.setProcessName("ProcessName406282015");
        _canoniseProcess_payload.setVersionName("VersionName1339368144");
        _canoniseProcess_payload.setNativeType("NativeType455252907");
        _canoniseProcess_payload.setDomain("Domain1110185847");
        javax.activation.DataHandler _canoniseProcess_payloadProcessDescription = null;
        _canoniseProcess_payload.setProcessDescription(_canoniseProcess_payloadProcessDescription);
        _canoniseProcess_payload.setUsername("Username1374071061");
        org.apromore.manager.model_canoniser.CanoniseProcessOutputMsgType _canoniseProcess__return = port.canoniseProcess(_canoniseProcess_payload);
        System.out.println("canoniseProcess.result=" + _canoniseProcess__return);


        }
        {
        System.out.println("Invoking deCanoniseProcess...");
        org.apromore.manager.model_canoniser.DeCanoniseProcessInputMsgType _deCanoniseProcess_payload = new org.apromore.manager.model_canoniser.DeCanoniseProcessInputMsgType();
        _deCanoniseProcess_payload.setProcessId(1973360674);
        _deCanoniseProcess_payload.setVersion("Version1872522955");
        _deCanoniseProcess_payload.setNativeType("NativeType-619076983");
        javax.activation.DataHandler _deCanoniseProcess_payloadCpf = null;
        _deCanoniseProcess_payload.setCpf(_deCanoniseProcess_payloadCpf);
        javax.activation.DataHandler _deCanoniseProcess_payloadAnf = null;
        _deCanoniseProcess_payload.setAnf(_deCanoniseProcess_payloadAnf);
        org.apromore.manager.model_canoniser.DeCanoniseProcessOutputMsgType _deCanoniseProcess__return = port.deCanoniseProcess(_deCanoniseProcess_payload);
        System.out.println("deCanoniseProcess.result=" + _deCanoniseProcess__return);


        }
        {
        System.out.println("Invoking canoniseVersion...");
        org.apromore.manager.model_canoniser.CanoniseVersionInputMsgType _canoniseVersion_payload = new org.apromore.manager.model_canoniser.CanoniseVersionInputMsgType();
        javax.activation.DataHandler _canoniseVersion_payloadNative = null;
        _canoniseVersion_payload.setNative(_canoniseVersion_payloadNative);
        _canoniseVersion_payload.setUsername("Username497197202");
        _canoniseVersion_payload.setNativeType("NativeType1413749910");
        _canoniseVersion_payload.setProcessId(Integer.valueOf(-330721507));
        _canoniseVersion_payload.setNewVersion("NewVersion-1195659996");
        _canoniseVersion_payload.setPreVersion("PreVersion1233198310");
        _canoniseVersion_payload.setDomain("Domain-1250067868");
        org.apromore.manager.model_canoniser.CanoniseVersionOutputMsgType _canoniseVersion__return = port.canoniseVersion(_canoniseVersion_payload);
        System.out.println("canoniseVersion.result=" + _canoniseVersion__return);


        }

        System.exit(0);
    }

}

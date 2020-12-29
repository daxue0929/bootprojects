package com.daxue;

import com.sun.org.apache.xerces.internal.util.XMLInputSourceAdaptor;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import javax.xml.transform.TransformerFactory;

public class RequestModel {

    public static final String UFINTERFACE = "ufinterface";
    public static final String BILL = "bill";
    public static final String BILLHEAD = "billhead";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String CODE = "code";
    public static final String NAME = "name";
    public static final String USEDNAME = "usedname";
    public static final String BIRTHDATE = "birthdate";
    public static final String SEX = "sex";
    public static final String IDTYPE = "idtype";
    public static final String ID = "id";
    public static final String MNECODE = "mnecode";
    public static final String JOINWORKDATE = "joinworkdate";
    public static final String ADDR = "addr";
    public static final String OFFICEPHONE = "officephone";
    public static final String HOMEPHONE = "homephone";
    public static final String MOBILE = "mobile";
    public static final String EMAIL = "email";
    public static final String PSNJOBS = "psnjobs";
    public static final String ITEM = "item";

    public static final String PSNCODE = "psncode";
    public static final String PK_PSNCL = "pk_psncl";
    public static final String PK_DEPT = "pk_dept";
    public static final String ISMAINJOB = "ismainjob";
    public static final String INDUTYDATE = "indutydate";


    public static void main(String[] args) {
        RequestModel main = new RequestModel();
        main.getRequestWithXMLString();
    }

    public void getRequestWithXMLString() {
        initValue();
        Document document = DocumentHelper.createDocument();
        Element ufinterfaceElement = document.addElement(UFINTERFACE)
                .addAttribute("account", "develop")
                .addAttribute("billtype", "psndoc")
                .addAttribute("filename", "")
                .addAttribute("groupcode", "01")
                .addAttribute("isexchange", "Y")
                .addAttribute("replace", "Y")
                .addAttribute("roottag","")
                .addAttribute("sender", "yufu");
        Element billElement = ufinterfaceElement.addElement(BILL).addAttribute("id", "498JUQ123");
        Element headElement = billElement.addElement(BILLHEAD);

        headElement.addElement(PK_GROUP).addText(pkGroup);
        headElement.addElement(PK_ORG).addText(pkOrg);
        headElement.addElement(CODE).addText(code);
        headElement.addElement(NAME).addText(name);
        headElement.addElement(USEDNAME).addText(usedName);
        headElement.addElement(BIRTHDATE).addText(birthdate);
        headElement.addElement(SEX).addText(sex);
        headElement.addElement(IDTYPE).addText(idType);
        headElement.addElement(ID).addText(id);
        headElement.addElement(MNECODE).addText(mnecode);
        headElement.addElement(JOINWORKDATE).addText(joinworkdate);
        headElement.addElement(ADDR).addText(addr);
        headElement.addElement(OFFICEPHONE).addText(officephone);
        headElement.addElement(HOMEPHONE).addText(homephone);
        headElement.addElement(MOBILE).addText(mobile);
        headElement.addElement(EMAIL).addText(email);

        Element psnjobsElement = headElement.addElement(PSNJOBS);
        Element itemElement = psnjobsElement.addElement(ITEM);

        itemElement.addElement(PK_GROUP).addText(pkGroup);
        itemElement.addElement(PK_ORG).addText(pkOrg);
        itemElement.addElement(PSNCODE).addText(psncode);
        itemElement.addElement(PK_PSNCL).addText(pk_psncl);
        itemElement.addElement(PK_DEPT).addText(pk_dept);
        itemElement.addElement(ISMAINJOB).addText(ismainjob);
        itemElement.addElement(INDUTYDATE).addText(indutydate);






        String s = document.asXML();
        System.out.println(s);

//        TransformerFactory factory = TransformerFactory.newInstance();
    }

    public void initValue() {
        this.pkGroup = "";
        this.pkOrg = "";
        this.code = "";
        this.name = "";
        this.usedName = "";
        this.birthdate = "";
        this.sex = "";
        this.idType = "";
        this.id = "";
        this.mnecode = "";
        this.joinworkdate = "";
        this.addr = "";
        this.officephone = "";
        this.homephone = "";
        this.email = "";
        this.mobile = "";
        this.psncode = "";
        this.pk_psncl = "";
        this.pk_dept = "";
        this.ismainjob = "";
        this.indutydate = "";
    }

    private String pkGroup;

    private String pkOrg;

    private String code;

    private String name;

    private String usedName;

    private String birthdate;

    private String sex;

    private String idType;

    private String id;

    private String mnecode;
    /**
     * 参加工作日期,最大长度为19,类型为:UFDate
     * 2020-12-14 12:27:26
     */
    private String joinworkdate;
    private String addr;

    /**
     * 办公电话,最大长度为30,类型为:String
     */
    private String officephone;

    private String homephone;

    private String mobile;

    private String email;

    /**
     * 员工编号,最大长度为40,类型为:String
     */
    private String psncode;
    /**
     * 人员类别,最大长度为20,类型为:String
     */
    private String pk_psncl;
    /**
     * 所在部门,最大长度为20,类型为:String
     */
    private String pk_dept;
    /**
     * 是否主职,最大长度为1,类型为:UFBoolean
     * Y
     */
    private String ismainjob;

    /**
     * 到职日期,最大长度为19,类型为:UFDate
     */
    private String indutydate;




















}

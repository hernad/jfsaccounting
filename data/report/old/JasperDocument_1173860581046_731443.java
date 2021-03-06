/*
 * Generated by JasperReports - 2007-03-14 09:23
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;



/**
 *
 */
public class JasperDocument_1173860581046_731443 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillField field_report46bundle = null;
    private JRFillField field_report46parameters = null;
    private JRFillField field_report46report = null;
    private JRFillField field_report46datasource = null;
    private JRFillField field_report46name = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_report46bundle = (JRFillField)fm.get("report.bundle");
        field_report46parameters = (JRFillField)fm.get("report.parameters");
        field_report46report = (JRFillField)fm.get("report.report");
        field_report46datasource = (JRFillField)fm.get("report.datasource");
        field_report46name = (JRFillField)fm.get("report.name");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.util.Map)(((java.util.Map)field_report46parameters.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)field_report46bundle.getValue()));
                break;
            }
            case 10 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(((net.sf.jasperreports.engine.JRDataSource)field_report46datasource.getValue()));
                break;
            }
            case 11 : 
            {
                value = (net.sf.jasperreports.engine.JasperReport)(((net.sf.jasperreports.engine.JasperReport)field_report46report.getValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.util.Map)(((java.util.Map)field_report46parameters.getOldValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)field_report46bundle.getOldValue()));
                break;
            }
            case 10 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(((net.sf.jasperreports.engine.JRDataSource)field_report46datasource.getOldValue()));
                break;
            }
            case 11 : 
            {
                value = (net.sf.jasperreports.engine.JasperReport)(((net.sf.jasperreports.engine.JasperReport)field_report46report.getOldValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));
                break;
            }
            case 8 : 
            {
                value = (java.util.Map)(((java.util.Map)field_report46parameters.getValue()));
                break;
            }
            case 9 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)field_report46bundle.getValue()));
                break;
            }
            case 10 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(((net.sf.jasperreports.engine.JRDataSource)field_report46datasource.getValue()));
                break;
            }
            case 11 : 
            {
                value = (net.sf.jasperreports.engine.JasperReport)(((net.sf.jasperreports.engine.JasperReport)field_report46report.getValue()));
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}

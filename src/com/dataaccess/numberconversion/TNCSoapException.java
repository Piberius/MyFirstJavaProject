

package com.dataaccess.numberconversion;
//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 9.3.3.2
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: 44320FAD386DA46A43B846174BF0C787A0BEAD3EA49E327B18C4E49B709A495619D85DAA80DA2EF334333891530F32B24492F7F7645997EB21BDBF1272FE242B
//------------------------------------------------------------------------

public class TNCSoapException extends java.lang.Exception
{
    private org.w3c.dom.Element _details=null;
    private Object _fault = null;
    
    public TNCSoapException(String message,org.w3c.dom.Element details)
    {
        super(message);
        _details=details;
    }

    public TNCSoapException(Object fault)
    {
        _fault=fault;
    }

    public Object getFault() {
        return _fault;
    }


    public org.w3c.dom.Element getDetails() {
        return _details;
    }
}
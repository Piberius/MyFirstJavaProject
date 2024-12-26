

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

public class TNCBinaryObject implements java.io.Serializable
{
    private byte[] _bytes = null;    
    private transient java.io.InputStream _stream = null;

    private String _contentType = null;

    public TNCBinaryObject(byte[] bytes) {
        _bytes = bytes;
    }

    public TNCBinaryObject(java.io.InputStream stream) {
        _stream = stream;
    }
    
    public Object getUnderlayingObject()
    {
        if (_bytes != null)
            return _bytes;
        else if (_stream != null)
            return _stream;
        else 
            return null;
    }
    
    public java.io.InputStream getStream()
    {
        return _stream;
    }
    
    public byte[] getBytes() {
        return _bytes;
    }

    public void setBytes(byte[] bytes) {
        this._bytes = bytes;
    }

    public String getContentType() {
        return _contentType;
    }

    public void setContentType(String contentType) {
        this._contentType = contentType;
    }
}
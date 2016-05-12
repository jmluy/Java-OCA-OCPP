package eu.chargetime.ocpp.model;

import eu.chargetime.ocpp.PropertyConstraintException;
import eu.chargetime.ocpp.utilities.ModelUtil;

/**
 ChargeTime.eu - Java-OCA-OCPP
 Copyright (C) 2015-2016 Thomas Volden <tv@chargetime.eu>

 MIT License

 Copyright (c) 2016 Thomas Volden

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */
public class BootNotificationRequest implements Request
{
    private String chargePointVendor;
    private String chargePointModel;
    private String chargeBoxSerialNumber;
    private String chargePointSerialNumber;
    private String firmwareVersion;
    private String iccid;
    private String imsi;
    private String meterSerialNumber;
    private String meterType;

    public BootNotificationRequest() { }

    public BootNotificationRequest(String vendor, String model) {
        chargePointVendor = vendor;
        chargePointModel = model;
    }

    public String getChargePointVendor()
    {
        return chargePointVendor;
    }

    public void setChargePointVendor(String chargePointVendor) throws PropertyConstraintException {
        if (!ModelUtil.validate(chargePointVendor, 20))
            throw new PropertyConstraintException("chargePointVendor", chargePointVendor);

        this.chargePointVendor = chargePointVendor;
    }

    public String getChargePointModel()
    {
        return chargePointModel;
    }

    public void setChargePointModel(String chargePointModel) throws PropertyConstraintException
    {
        if (!ModelUtil.validate(chargePointModel, 20))
            throw new PropertyConstraintException("chargePointModel", chargePointModel);

        this.chargePointModel = chargePointModel;
    }

    public String getChargeBoxSerialNumber()
    {
        return chargeBoxSerialNumber;
    }

    public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) throws PropertyConstraintException
    {
        if (!ModelUtil.validate(chargeBoxSerialNumber, 25))
            throw new PropertyConstraintException("chargeBoxSerialNumber", chargeBoxSerialNumber);

        this.chargeBoxSerialNumber = chargeBoxSerialNumber;
    }

    public String getChargePointSerialNumber()
    {
        return chargePointSerialNumber;
    }

    public void setChargePointSerialNumber(String chargePointSerialNumber) throws PropertyConstraintException {
        if (!ModelUtil.validate(chargePointSerialNumber, 25))
            throw new PropertyConstraintException("chargePointSerialNumber", chargePointSerialNumber);

        this.chargePointSerialNumber = chargePointSerialNumber;
    }

    public String getFirmwareVersion()
    {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) throws PropertyConstraintException {
        if (!ModelUtil.validate(firmwareVersion, 50))
            throw new PropertyConstraintException("firmwareVersion", firmwareVersion);

        this.firmwareVersion = firmwareVersion;
    }

    public String getIccid()
    {
        return iccid;
    }

    public void setIccid(String iccid) throws PropertyConstraintException {
        if (!ModelUtil.validate(iccid, 20))
            throw new PropertyConstraintException("iccid", iccid);

        this.iccid = iccid;
    }

    public String getImsi()
    {
        return imsi;
    }

    public void setImsi(String imsi) throws PropertyConstraintException {
        if (!ModelUtil.validate(imsi, 20))
            throw new PropertyConstraintException("imsi", imsi);

        this.imsi = imsi;
    }

    public String getMeterSerialNumber()
    {
        return meterSerialNumber;
    }

    public void setMeterSerialNumber(String meterSerialNumber) throws PropertyConstraintException {
        if (!ModelUtil.validate(meterSerialNumber, 25))
            throw new PropertyConstraintException("meterSerialNumber", meterSerialNumber);

        this.meterSerialNumber = meterSerialNumber;
    }

    public String getMeterType()
    {
        return meterType;
    }

    public void setMeterType(String meterType) throws PropertyConstraintException {
        if (!ModelUtil.validate(meterType, 25))
            throw new PropertyConstraintException("meterType", meterType);

        this.meterType = meterType;
    }

    @Override
    public boolean validate() {
        boolean valid = true;
        valid &= ModelUtil.validate(chargePointModel, 20);
        valid &= ModelUtil.validate(chargePointVendor, 20);
        return valid;
    }
}
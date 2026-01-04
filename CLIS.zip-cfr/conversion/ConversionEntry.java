/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cif.formatconversion.ConversionBase
 *  cif.formatconversion.ConversionEntryInterface
 *  conversion.ClisFormatConversion
 */
package conversion;

import cif.formatconversion.ConversionBase;
import cif.formatconversion.ConversionEntryInterface;
import conversion.ClisFormatConversion;

public class ConversionEntry
implements ConversionEntryInterface {
    public ConversionBase getConversionInstance() {
        ClisFormatConversion clisFormatConversion = new ClisFormatConversion();
        return clisFormatConversion;
    }
}

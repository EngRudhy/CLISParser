/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a.a.a
 *  cif.dataengine.DataEngine
 *  cif.dataengine.DataPath
 *  cif.dataengine.io.LogDataSource
 *  cif.dataengine.io.LogWell
 *  cif.formatconversion.ConversionBase
 *  cif.formatconversion.ConversionParameters
 */
package conversion;

import a.a.a;
import cif.dataengine.DataEngine;
import cif.dataengine.DataPath;
import cif.dataengine.io.LogDataSource;
import cif.dataengine.io.LogWell;
import cif.formatconversion.ConversionBase;
import cif.formatconversion.ConversionParameters;
import java.awt.Frame;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class ClisFormatConversion
extends ConversionBase {
    private a a = new a();
    private double b;
    private double c;
    private double[] d;
    private double[] e;
    private double[] f;
    private String[] g = null;
    private String[] h = null;
    private String[] i = null;
    private String[] j;
    private String[] k;
    private DataPath[] l;
    private int m = -1;
    private boolean n = false;

    public String getFormatTypeString() {
        return ResourceBundle.getBundle("conversion/Bundle").getString("CLIS_FORMAT_STRING");
    }

    public boolean isThisFormat(String string) {
        if (this.a != null) return a.a.a.b((String)string);
        return false;
    }

    public DataPath[] convert(int n) {
        try {
            int n2 = n;
            ClisFormatConversion clisFormatConversion = this;
            LogDataSource logDataSource = DataEngine.getDefault().getMainDataSource();
            logDataSource = logDataSource.getLogWorkSpace(clisFormatConversion.g[n2]);
            if (logDataSource == null) {
                JOptionPane.showMessageDialog(null, ResourceBundle.getBundle("conversion/Bundle").getString("CREATEFILE_ERROR"), ResourceBundle.getBundle("conversion/Bundle").getString("ERROR"), 0);
            } else {
                LogWell logWell = logDataSource.getLogWell(clisFormatConversion.h[n2]);
                if (logWell == null) {
                    logWell = logDataSource.createWell(clisFormatConversion.h[n2]);
                }
                if (logWell != null) {
                    clisFormatConversion.a.a(logWell, n2, clisFormatConversion.i[n2]);
                }
            }
            this.l = this.a.c(n);
            this.a.e();
            System.gc();
            return this.l;
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, ResourceBundle.getBundle("conversion/Bundle").getString("CREATEFILE_ERROR"), ResourceBundle.getBundle("conversion/Bundle").getString("ERROR"), 0);
            return null;
        }
    }

    public StringBuffer fileScan() {
        this.a.a(this.selectedFilePath);
        StringBuffer stringBuffer = this.a.c();
        return stringBuffer;
    }

    public boolean popupSettingDialog(Frame frame) {
        this.n = false;
        return true;
    }

    public boolean popupBatchSettingDialog(Frame frame) {
        this.n = true;
        return true;
    }

    public double getStartDepth(int n) {
        if (this.m == -1) {
            this.m = n;
        }
        this.b = this.a.f(n);
        return this.b;
    }

    public double getEndDepth(int n) {
        if (this.m == -1) {
            this.m = n;
        }
        this.c = this.a.g(n);
        return this.c;
    }

    public String getWellName(int n) {
        if (this.m != -1) return this.a.b(n);
        this.m = n;
        return this.a.b(n);
    }

    public int getCurveNumber(int n) {
        if (this.m == -1) {
            this.m = n;
        }
        this.j = this.a.d(n);
        if (this.j != null) return this.j.length;
        return 0;
    }

    public String getCurveName(int n, int n2) {
        if (this.m == -1) {
            this.m = n;
        }
        this.j = this.a.d(n);
        if (this.j == null) return "";
        if (n2 < 0) return "";
        if (n2 <= this.j.length - 1) return this.j[n2];
        return "";
    }

    public String getCurveUnit(int n, int n2) {
        if (this.m == -1) {
            this.m = n;
        }
        this.k = this.a.e(n);
        if (this.k == null) return "";
        if (n2 < 0) return "";
        if (n2 <= this.k.length - 1) return this.k[n2];
        return "";
    }

    public String getDepthUnit(int n) {
        if (this.m != -1) return this.a.a(n);
        this.m = n;
        return this.a.a(n);
    }

    public double getLeftScale(int n, int n2) {
        if (this.m == -1) {
            this.m = n;
        }
        this.e = this.a.j(n);
        if (this.e == null) return 99999.0;
        if (n2 < 0) return 99999.0;
        if (n2 <= this.e.length - 1) return this.e[n2];
        return 99999.0;
    }

    public double getRightScale(int n, int n2) {
        if (this.m == -1) {
            this.m = n;
        }
        this.d = this.a.i(n);
        if (this.d == null) return -99999.0;
        if (n2 < 0) return -99999.0;
        if (n2 <= this.d.length - 1) return this.d[n2];
        return -99999.0;
    }

    public double getDepthLevel(int n, int n2) {
        if (n == -1) {
            this.m = n;
        }
        this.f = this.a.h(n);
        if (this.f == null) return 0.0;
        if (n2 < 0) return 0.0;
        if (n2 <= this.f.length - 1) return this.f[n2];
        return 0.0;
    }

    public void setOutputParameters(ConversionParameters[] conversionParametersArray) {
        int n = conversionParametersArray.length;
        if (this.g == null || this.g.length != n) {
            this.g = new String[n];
        }
        if (this.h == null || this.h.length != n) {
            this.h = new String[n];
        }
        if (this.i == null || this.i.length != n) {
            this.i = new String[n];
        }
        int n2 = 0;
        while (n2 < n) {
            ConversionParameters conversionParameters = conversionParametersArray[n2];
            this.g[n2] = conversionParameters.getWSName();
            this.h[n2] = conversionParameters.getWellName();
            this.i[n2] = conversionParameters.getCatagoryName();
            this.a.a(n2, conversionParameters);
            ++n2;
        }
    }

    public void setSelectedFilePath(String string) {
        super.setSelectedFilePath(string);
    }

    public int getLogicalFileNum() {
        try {
            if (this.n) {
                this.a.a(this.selectedFilePath);
                this.a.a();
                this.a.b();
            } else {
                this.a.b();
            }
        }
        catch (Exception exception) {
            return 0;
        }
        return this.a.d();
    }

    public String getLogicalFileName(int n) {
        return this.a.k(n);
    }

    public String getFormatExtension() {
        return "cls";
    }
}

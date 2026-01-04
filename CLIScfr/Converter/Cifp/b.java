/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.b$1
 *  Converter.Cifp.b$a
 *  Converter.Cifp.c
 *  Converter.Cifp.d
 *  Converter.Cifp.e
 *  Converter.Cifp.j
 *  Converter.Cifp.y
 *  a.b.a
 *  a.b.a.a
 *  a.b.b
 *  a.b.d
 *  a.b.e
 *  a.b.f
 *  cif.baseutil.configuration.Config
 *  cif.dataengine.io.Curve1D
 *  cif.dataengine.io.Curve2D
 *  cif.dataengine.io.Curve3D
 *  cif.dataengine.io.CurveXD
 *  cif.dataengine.io.LogCategory
 *  cif.dataengine.io.LogCurve1D
 *  cif.dataengine.io.LogCurve2D
 *  cif.dataengine.io.LogCurve3D
 *  cif.dataengine.io.Logging
 *  cif.dataengine.io.LoggingPropertiesEX
 */
package Converter.Cifp;

import Converter.Cifp.b;
import Converter.Cifp.c;
import Converter.Cifp.d;
import Converter.Cifp.e;
import Converter.Cifp.j;
import Converter.Cifp.y;
import a.b.f;
import cif.baseutil.configuration.Config;
import cif.dataengine.io.Curve1D;
import cif.dataengine.io.Curve2D;
import cif.dataengine.io.Curve3D;
import cif.dataengine.io.CurveXD;
import cif.dataengine.io.LogCategory;
import cif.dataengine.io.LogCurve1D;
import cif.dataengine.io.LogCurve2D;
import cif.dataengine.io.LogCurve3D;
import cif.dataengine.io.Logging;
import cif.dataengine.io.LoggingPropertiesEX;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;

public final class b
extends d {
    private c d = c.a;
    private String e = null;
    private byte f = (byte)5;
    private double g = -99999.0;
    private double h = 99999.0;
    private int i = 0;
    private int[] j = null;
    private double k = 0.0;
    private double l = 0.0;
    private y m = null;
    private double n = 0.0;
    private double o = 0.0;
    private String p = "";
    private boolean q = true;
    private a.b.e r = null;
    private LoggingPropertiesEX s = null;

    public b() {
        this.b = Converter.Cifp.e.a;
    }

    public final void a(LoggingPropertiesEX loggingPropertiesEX) {
        this.s = loggingPropertiesEX;
    }

    public final int[] a() {
        return this.j;
    }

    public final void a(int[] nArray) throws IllegalArgumentException {
        if (nArray == null) {
            throw new IllegalArgumentException("CifpCurve.setDimension(): dimension is null");
        }
        this.j = nArray;
    }

    public final boolean b() {
        return this.q;
    }

    public final void a(boolean bl) {
        this.q = bl;
    }

    public final void a(Double d2) throws NullPointerException {
        if (this.m == null) {
            throw new NullPointerException("CifpCurve.setStartDepth():index driver is null");
        }
        if (d2 == null) {
            if (this.m.f()) {
                this.k = this.m.b();
                return;
            }
            if (this.m.e() == null) return;
            this.k = this.m.e()[0];
            return;
        }
        if (this.m.g()) {
            this.k = d2;
            return;
        }
        this.l = d2;
    }

    public final void b(Double d2) throws NullPointerException {
        if (this.m == null) {
            throw new NullPointerException("CifpCurve.setEndDepth():index driver is null");
        }
        if (d2 == null) {
            if (this.m.f()) {
                this.l = this.m.c();
                return;
            }
            if (this.m.e() == null) return;
            this.l = this.m.e()[this.m.e().length - 1];
            return;
        }
        if (this.m.g()) {
            this.l = d2;
            return;
        }
        this.k = d2;
    }

    public final void a(a.b.e e2) throws IllegalArgumentException {
        if (e2 == null) {
            throw new IllegalArgumentException("CifpCurve.setCurveDataReader():data reader is null");
        }
        this.r = e2;
    }

    public final void a(c c2) {
        this.d = c2;
    }

    public final String c() {
        return this.e;
    }

    public final void a(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("CifpCurve.setUnit():unit is null!");
        }
        this.e = string;
    }

    public final void a(byte by) {
        this.f = by;
    }

    public final double d() {
        return this.g;
    }

    public final void a(double d2) {
        this.g = d2;
    }

    public final double e() {
        return this.h;
    }

    public final void b(double d2) {
        this.h = d2;
    }

    public final y f() throws NullPointerException {
        if (this.m != null) return this.m;
        throw new NullPointerException("CifpCurve.getIndexDriver(): index driver is null");
    }

    public final void a(y y2) throws NullPointerException {
        if (y2 == null) {
            throw new NullPointerException("CifpCurve.getIndexDriver(): index driver is null");
        }
        this.m = y2;
    }

    /*
     * Unable to fully structure code
     */
    private int a(double var1_1, a.b.d var3_4) throws IndexOutOfBoundsException {
        block3: {
            block5: {
                block7: {
                    block6: {
                        block4: {
                            block2: {
                                var2_5 = var3_4;
                                var6_6 = var1_1;
                                var1_2 = this;
                                if (!var1_2.m.f()) break block2;
                                v0 = Math.abs(var1_2.m.d()) < 1.0E-5 ? -2147483648 : var1_2.b(var6_6, var2_5);
                                break block3;
                            }
                            if (var1_2.m.h() != 0) break block4;
                            v0 = -2147483648;
                            break block3;
                        }
                        var9_7 = var1_2.a(0);
                        if (var1_2.m.h() != 1) break block5;
                        if (a.b.d.b != var2_5) break block6;
                        if (!(var6_6 <= var9_7)) ** GOTO lbl-1000
                        v0 = 0;
                        break block3;
                    }
                    if (a.b.d.a != var2_5) break block7;
                    if (!(var6_6 >= var9_7)) ** GOTO lbl-1000
                    v0 = 0;
                    break block3;
                }
                if (Math.abs(var6_6 - var9_7) < 2.0) {
                    v0 = 0;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = -2147483648;
                }
                break block3;
            }
            var1_2.a(var1_2.m.h() - 1);
            v0 = var1_2.b(var6_6, var2_5);
        }
        var1_3 = v0;
        if (v0 != -2147483648) return var1_3;
        throw new IndexOutOfBoundsException("CifpCurve.findValueIndex():value index is not found");
    }

    private double a(int n) throws NullPointerException, IllegalArgumentException {
        if (this.m == null) {
            throw new NullPointerException("CifpCurve.getIndexValue(): index dirver is null");
        }
        if (n < 0) throw new IllegalArgumentException("CifpCurve.getIndexValue(): index is illegal");
        if (n >= this.m.h()) {
            throw new IllegalArgumentException("CifpCurve.getIndexValue(): index is illegal");
        }
        if (this.m.f()) {
            BigDecimal bigDecimal = BigDecimal.valueOf(this.m.b());
            BigDecimal bigDecimal2 = BigDecimal.valueOf(this.m.d());
            BigDecimal bigDecimal3 = BigDecimal.valueOf(n);
            return bigDecimal2.multiply(bigDecimal3).add(bigDecimal).doubleValue();
        }
        if (this.m.e() == null) return Double.MIN_VALUE;
        if (this.m.e().length != this.m.h()) return Double.MIN_VALUE;
        return this.m.e()[n];
    }

    final void b(String string) throws IllegalArgumentException, NullPointerException {
        a.b.a.a a2 = this.a.f().c();
        if (a2 == null) {
            throw new NullPointerException("CifpCurve.unitConverter():unit manager is null");
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException("CifpCurve.unitConverter():destUnit is empty");
        }
        String string2 = this.m.a();
        if (string2.isEmpty()) {
            throw new NullPointerException("CifpCurve.unitConverter():source unit is empty");
        }
        this.k = a2.a(string2, string, this.k);
        this.l = a2.a(string2, string, this.l);
        if (this.m.f()) {
            double d2 = a2.a(string2, string, this.m.b());
            double d3 = a2.a(string2, string, this.m.c());
            double d4 = a2.a(string2, string, this.m.d());
            this.m.a(d2);
            this.m.b(d3);
            this.m.c(d4);
            this.m.a(string);
            return;
        }
        int n = 0;
        while (n < this.m.e().length) {
            this.m.e()[n] = a2.a(string2, string, this.m.e()[n]);
            this.m.a(string);
            ++n;
        }
    }

    public final Logging a(LogCategory object) throws IOException, NullPointerException {
        if (this.m == null) {
            throw new NullPointerException("CifpCurve.write(): index driver is null");
        }
        if (c.a == this.d) {
            if (!this.m.f()) return this.d((LogCategory)object);
            return this.b((LogCategory)object);
        }
        if (c.b == this.d) {
            if (!(Math.abs(0.0) > 1.0E-5)) {
                if (this.j[0] == 0) return null;
            }
            if (!this.m.f()) return this.d((LogCategory)object);
            return this.c((LogCategory)object);
        }
        if (c.c != this.d) return null;
        if (!this.m.f()) return null;
        LogCategory logCategory = object;
        object = this;
        if (((b)((Object)object)).r == null) {
            throw new NullPointerException("CifpCurve.writeCurve3D():data reader is null");
        }
        if (logCategory == null) {
            throw new IllegalArgumentException("CifpCurve.writeCurve3D():category is null");
        }
        Curve3D curve3D = new Curve3D();
        curve3D.setCurveName(((b)((Object)object)).c);
        curve3D.setDepthLevel(Math.abs(Config.getInstance().formatDepth(((b)((Object)object)).m.d())));
        curve3D.setDataType(((b)((Object)object)).f);
        curve3D.setCurveUnit(((b)((Object)object)).e);
        curve3D.setDepthUnit(((b)((Object)object)).m.a());
        curve3D.setTimeSampleStartTime(0.0);
        curve3D.setTimeSampleUnit(((b)((Object)object)).p);
        curve3D.setTimeSampleLevel(0.0);
        curve3D.setTimeSampleNum(((b)((Object)object)).j[0]);
        curve3D.setArrayNum(0);
        int n = super.a(((b)((Object)object)).k, a.b.d.b);
        int n2 = super.a(((b)((Object)object)).l, a.b.d.b);
        double d2 = super.a(n);
        double d3 = super.a(n2);
        if (!((b)((Object)object)).m.g()) {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
        }
        curve3D.setStartDepth(Config.getInstance().formatDepth(d2));
        curve3D.setEndDepth(Config.getInstance().formatDepth(d3));
        LogCurve3D logCurve3D = (LogCurve3D)logCategory.createCurve((CurveXD)curve3D);
        if (((b)((Object)object)).s != null) {
            logCurve3D.setLoggingPropertiesEX(((b)((Object)object)).s);
        }
        if (Math.abs(((b)((Object)object)).m.d() - -99999.0) < 1.0E-5) {
            return logCurve3D;
        }
        if (Math.abs(((b)((Object)object)).m.b() - -99999.0) < 1.0E-5) return logCurve3D;
        if (Math.abs(((b)((Object)object)).m.c() - -99999.0) < 1.0E-5) {
            return logCurve3D;
        }
        logCurve3D.getTimeSampleCount();
        logCurve3D.setLeftScale(((b)((Object)object)).g);
        logCurve3D.setRightScale(((b)((Object)object)).h);
        logCurve3D.flush();
        return logCurve3D;
    }

    private Logging b(LogCategory logCategory) throws IOException, NullPointerException, IllegalArgumentException {
        if (this.r == null) {
            throw new NullPointerException("CifpCurve.writeCurve1D():dataReader is null");
        }
        if (logCategory == null) {
            throw new IllegalArgumentException("CifpCurve.writeCurve1D():category is null");
        }
        Curve1D curve1D = new Curve1D();
        curve1D.setCurveName(this.c);
        curve1D.setDepthLevel(Math.abs(Config.getInstance().formatDepth(this.m.d())));
        curve1D.setDataType(this.f);
        curve1D.setCurveUnit(this.e);
        curve1D.setDepthUnit(this.m.a());
        int n = this.a(this.k, a.b.d.b);
        int n2 = this.a(this.l, a.b.d.b);
        int n3 = n2 - n + 1;
        double d2 = this.a(n);
        double d3 = this.a(n2);
        if (!this.m.g()) {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
        }
        curve1D.setStartDepth(Config.getInstance().formatDepth(d2));
        curve1D.setEndDepth(Config.getInstance().formatDepth(d3));
        LogCurve1D logCurve1D = (LogCurve1D)logCategory.createCurve((CurveXD)curve1D);
        if (this.s != null) {
            logCurve1D.setLoggingPropertiesEX(this.s);
        }
        if (Math.abs(this.m.d() - -99999.0) < 1.0E-5) {
            return logCurve1D;
        }
        if (Math.abs(this.m.b() - -99999.0) < 1.0E-5) return logCurve1D;
        if (Math.abs(this.m.c() - -99999.0) < 1.0E-5) {
            return logCurve1D;
        }
        int n4 = 0x1400000 / a.b.a.a((byte)this.f);
        if (n4 == 0) {
            n4 = 200;
        }
        n4 = n3 > n4 ? n4 : n3;
        int n5 = 0;
        int n6 = 0;
        float f2 = 0.0f;
        float f3 = n3;
        f f4 = this.a.f().b();
        while (n4 <= n3 && !this.a.f().a()) {
            Object object = this.r.a(n, n4);
            a a2 = new a(this, this.g, this.h);
            Converter.Cifp.a.a((f)this.a.f().b(), (Object)object, (byte)this.f, (a)a2);
            if (this.a.c()) {
                if (!f4.a(a2.a) && n5 == 0) {
                    this.g = a2.a;
                    ++n5;
                } else if (!f4.a(a2.a) && this.g > a2.a) {
                    this.g = a2.a;
                }
                if (!f4.a(a2.b) && n6 == 0) {
                    this.h = a2.b;
                    ++n6;
                } else if (!f4.a(a2.b) && this.h < a2.b) {
                    this.h = a2.b;
                }
            }
            if (!this.m.g()) {
                b.a(object);
            }
            Object object2 = object;
            int n7 = n4;
            double d5 = this.a(n, n4);
            a2 = logCurve1D;
            object = this;
            if (a2 == null) {
                throw new IllegalArgumentException("CifpCurve.writeData1D(): logcurve1d is null!");
            }
            if (n7 != Array.getLength(object2)) {
                throw new IllegalArgumentException("CifpCurve.writeData1D(): data count is unequal to array");
            }
            switch (((b)((Object)object)).f) {
                case 1: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Byte")) break;
                    a2.writeData(d5, n7, (byte[])object2, null);
                    break;
                }
                case 2: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Short")) break;
                    object = (short[])object2;
                    a2.writeData(d5, n7, (short[])object, null);
                    break;
                }
                case 3: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Integer")) break;
                    object = (int[])object2;
                    a2.writeData(d5, n7, (int[])object, null);
                    break;
                }
                case 4: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Long")) break;
                    a2.writeData(d5, n7, (long[])object2, null);
                    break;
                }
                case 5: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Float")) break;
                    a2.writeData(d5, n7, (float[])object2, null);
                    break;
                }
                case 6: {
                    if (!Array.get(object2, 0).getClass().getSimpleName().equalsIgnoreCase("Double")) break;
                    a2.writeData(d5, n7, (double[])object2, null);
                    break;
                }
            }
            this.a.f().a((int)((f2 += (float)n4) / f3 * 100.0f));
            if ((n3 -= n4) <= 0) break;
            n += n4;
            n4 = n3 > n4 ? n4 : n3;
        }
        logCurve1D.setLeftScale(this.g);
        logCurve1D.setRightScale(this.h);
        logCurve1D.flush();
        return logCurve1D;
    }

    private Logging c(LogCategory logCategory) throws IOException, NullPointerException, IllegalArgumentException {
        if (this.r == null) {
            throw new NullPointerException("CifpCurve.writeCurve2D():data reader is null");
        }
        if (logCategory == null) {
            throw new IllegalArgumentException("CifpCurve.writeCurve2D():category is null");
        }
        Curve2D curve2D = new Curve2D();
        curve2D.setCurveName(this.c);
        curve2D.setDepthLevel(Math.abs(Config.getInstance().formatDepth(this.m.d())));
        curve2D.setDataType(this.f);
        curve2D.setCurveUnit(this.e);
        curve2D.setDepthUnit(this.m.a());
        curve2D.setTimeSampleStartTime(0.0);
        curve2D.setTimeSampleUnit(this.p);
        curve2D.setTimeSampleLevel(0.0);
        curve2D.setTimeSampleNum(this.j[0]);
        int n = this.a(this.k, a.b.d.b);
        int n2 = this.a(this.l, a.b.d.b);
        int n3 = n2 - n + 1;
        double d2 = this.a(n);
        double d3 = this.a(n2);
        if (!this.m.g()) {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
        }
        curve2D.setStartDepth(Config.getInstance().formatDepth(d2));
        curve2D.setEndDepth(Config.getInstance().formatDepth(d3));
        LogCurve2D logCurve2D = (LogCurve2D)logCategory.createCurve((CurveXD)curve2D);
        if (this.s != null) {
            logCurve2D.setLoggingPropertiesEX(this.s);
        }
        if (Math.abs(this.m.d() - -99999.0) < 1.0E-5) {
            return logCurve2D;
        }
        if (Math.abs(this.m.b() - -99999.0) < 1.0E-5) return logCurve2D;
        if (Math.abs(this.m.c() - -99999.0) < 1.0E-5) {
            return logCurve2D;
        }
        int n4 = 0x1400000 / (a.b.a.a((byte)this.f) * this.j[0]);
        if (n4 == 0) {
            n4 = 200;
        }
        n4 = n3 > n4 ? n4 : n3;
        int n5 = 0;
        int n6 = 0;
        float f2 = 0.0f;
        float f3 = n3;
        f f4 = this.a.f().b();
        while (n4 <= n3 && !this.a.f().a()) {
            Object object = this.r.a(n, n4, 0, logCurve2D.getTimeSampleCount());
            a a2 = new a(this, this.g, this.h);
            Converter.Cifp.a.a((f)this.a.f().b(), (Object)object, (byte)this.f, (a)a2);
            if (this.a.c()) {
                if (!f4.a(a2.a) && n5 == 0) {
                    this.g = a2.a;
                    ++n5;
                } else if (!f4.a(a2.a) && this.g > a2.a) {
                    this.g = a2.a;
                }
                if (!f4.a(a2.b) && n6 == 0) {
                    this.h = a2.b;
                    ++n6;
                } else if (!f4.a(a2.b) && this.h < a2.b) {
                    this.h = a2.b;
                }
            }
            if (!this.m.g()) {
                b.a(object);
            }
            Object object2 = object;
            int n7 = n4;
            double d5 = this.a(n, n4);
            a2 = logCurve2D;
            object = this;
            if (a2 == null) {
                throw new IllegalArgumentException("CifpCurve.writeData2D(): logcurve2d is null");
            }
            if (object2 == null) {
                throw new IllegalArgumentException("CifpCurve.writeData2D(): data array is null");
            }
            switch (((b)((Object)object)).f) {
                case 1: {
                    a2.writeData(d5, n7, (byte[][])object2, null);
                    break;
                }
                case 2: {
                    object = (short[][])object2;
                    a2.writeData(d5, n7, (short[][])object, null);
                    break;
                }
                case 3: {
                    a2.writeData(d5, n7, (int[][])object2, null);
                    break;
                }
                case 4: {
                    a2.writeData(d5, n7, (long[][])object2, null);
                    break;
                }
                case 5: {
                    a2.writeData(d5, n7, (float[][])object2, null);
                    break;
                }
                case 6: {
                    a2.writeData(d5, n7, (double[][])object2, null);
                    break;
                }
            }
            this.a.f().a((int)((f2 += (float)n4) / f3 * 100.0f));
            if ((n3 -= n4) <= 0) break;
            n += n4;
            n4 = n3 > n4 ? n4 : n3;
        }
        logCurve2D.setLeftScale(this.g);
        logCurve2D.setRightScale(this.h);
        logCurve2D.flush();
        return logCurve2D;
    }

    private Logging d(LogCategory logCategory) throws IOException, NullPointerException, IllegalArgumentException {
        int n;
        a.b.b b2;
        int n2;
        if (this.a == null) throw new NullPointerException("CifpCurve.writeUnevenSamplingCurve(): parent is null or name is empty!");
        if (this.c.isEmpty()) {
            throw new NullPointerException("CifpCurve.writeUnevenSamplingCurve(): parent is null or name is empty!");
        }
        if (logCategory == null) {
            throw new IllegalArgumentException("CifpCurve.writeUnevenSamplingCurve(): category is null!");
        }
        j j2 = new j(this.a, this.c);
        int n3 = this.m.h();
        switch (1.a[this.d.ordinal()]) {
            case 1: 
            case 2: {
                n2 = 2;
                break;
            }
            default: {
                n2 = -1;
            }
        }
        j2.a(n3, n2);
        j2.a(0, a.b.b.g);
        j2.a(0, "DEPTH");
        j2.b(0, this.m.a());
        j2.b(0, 1);
        int n4 = this.f;
        switch (n4) {
            case 1: {
                b2 = a.b.b.b;
                break;
            }
            case 10: {
                b2 = a.b.b.i;
                break;
            }
            case 5: {
                b2 = a.b.b.f;
                break;
            }
            case 6: {
                b2 = a.b.b.g;
                break;
            }
            case 3: {
                b2 = a.b.b.d;
                break;
            }
            case 4: {
                b2 = a.b.b.e;
                break;
            }
            case 2: {
                b2 = a.b.b.c;
                break;
            }
            case 7: {
                b2 = a.b.b.h;
                break;
            }
            default: {
                b2 = a.b.b.a;
            }
        }
        j2.a(1, b2);
        j2.a(1, this.c);
        j2.b(1, this.e);
        n3 = 1;
        if (this.d == c.b) {
            n3 = this.j[0];
        }
        j2.b(1, n3);
        n2 = this.m.e().length - 1;
        n4 = n2 + 1;
        if (c.b != this.d) {
            if (c.a != this.d) return j2.a(logCategory);
            n = 0;
            if (!this.m.g()) {
                n = n4 - 1;
            }
        } else {
            int n5 = 0;
            if (!this.m.g()) {
                n5 = n4 - 1;
            }
            int n6 = 0;
            while (n6 < n2 + 1) {
                j2.a(n5, 0, this.m.e()[n6]);
                Object object = this.r.a(n6, 1, 0, n3);
                if (object != null) {
                    Converter.Cifp.a.a((f)this.a.f().b(), (Object)object, (byte)this.f, (a)new a(this, this.g, this.g));
                    byte by = this.f;
                    Object object2 = object;
                    n4 = 1;
                    int n7 = n5;
                    j j3 = j2;
                    Class<?> clazz = object2.getClass();
                    if (!clazz.isArray()) {
                        throw new IllegalArgumentException("CifpTable.setRecordObjectData():data is invalid!");
                    }
                    switch (by) {
                        case 1: {
                            j3.a(n7, 1, (byte[])object2);
                            break;
                        }
                        case 2: {
                            j3.a(n7, 1, (short[])object2);
                            break;
                        }
                        case 3: {
                            j3.a(n7, 1, (int[])object2);
                            break;
                        }
                        case 4: {
                            j3.a(n7, 1, (long[])object2);
                            break;
                        }
                        case 5: {
                            j3.a(n7, 1, (float[])object2);
                            break;
                        }
                        case 6: {
                            j3.a(n7, 1, (double[])object2);
                            break;
                        }
                    }
                    n5 = !this.m.g() ? --n5 : ++n5;
                }
                ++n6;
            }
            return j2.a(logCategory);
        }
        for (int i = 0; i < n2 + 1; ++i) {
            j2.a(n, 0, this.m.e()[i]);
            if (!this.m.g()) {
                --n;
                continue;
            }
            ++n;
        }
        Object object = this.r.a(0, n4);
        if (object == null) {
            return null;
        }
        Converter.Cifp.a.a((f)this.a.f().b(), (Object)object, (byte)this.f, (a)new a(this, this.g, this.g));
        if (!this.m.g()) {
            b.a(object);
        }
        int n8 = 0;
        while (n8 < n4) {
            switch (this.f) {
                case 1: {
                    j2.a(n8, 1, Array.getByte(object, n8));
                    break;
                }
                case 2: {
                    j2.a(n8, 1, Array.getShort(object, n8));
                    break;
                }
                case 3: {
                    j2.a(n8, 1, Array.getInt(object, n8));
                    break;
                }
                case 4: {
                    j2.a(n8, 1, Array.getLong(object, n8));
                    break;
                }
                case 5: {
                    j2.a(n8, 1, Array.getFloat(object, n8));
                    break;
                }
                case 6: {
                    j2.a(n8, 1, Array.getDouble(object, n8));
                    break;
                }
            }
            ++n8;
        }
        return j2.a(logCategory);
    }

    private static void a(Object object) {
        if (object == null) {
            throw new IllegalArgumentException("CifpCurve.reverse(): array is null");
        }
        if (Array.getLength(object) <= 0) return;
        int n = Array.getLength(object);
        int n2 = 0;
        while (n2 < n / 2) {
            Object object2 = Array.get(object, n2);
            Array.set(object, n2, Array.get(object, n - 1 - n2));
            Array.set(object, n - 1 - n2, object2);
            ++n2;
        }
    }

    private int b(double d2, a.b.d d3) {
        double d4;
        int n;
        double d5;
        int n2 = this.m.h();
        double d6 = 0.0;
        double d7 = this.a(0);
        if (!(d7 < (d5 = this.a(n2 - 1)))) {
            d6 = d7;
            d7 = d5;
            if (d2 < d7 || Math.abs(d2 - d7) < Math.abs(this.m.d())) {
                switch (1.b[d3.ordinal()]) {
                    case 1: {
                        return n2 - 1;
                    }
                }
                return n2 - 1;
            }
            if (d2 > d6 || Math.abs(d2 - d6) < Math.abs(this.m.d())) {
                switch (1.b[d3.ordinal()]) {
                    case 1: {
                        return 0;
                    }
                }
                return 0;
            }
            n = 0;
            --n2;
        } else {
            double d8;
            if (d2 < d7 || Math.abs(d2 - d7) < Math.abs(this.m.d())) {
                switch (1.b[d3.ordinal()]) {
                    case 1: {
                        return 0;
                    }
                }
                return 0;
            }
            if (d2 > d5 || Math.abs(d2 - d5) < Math.abs(this.m.d())) {
                switch (1.b[d3.ordinal()]) {
                    case 1: {
                        return n2 - 1;
                    }
                }
                return n2 - 1;
            }
            int n3 = 0;
            --n2;
            while (n3 < n2 - 1) {
                int n4 = (n3 + n2) / 2;
                d6 = this.a(n4);
                if (d2 == d6) {
                    return n4;
                }
                if (d2 > d6) {
                    n3 = n4;
                    continue;
                }
                n2 = n4;
            }
            if (d3 == a.b.d.a) {
                this.a(n3);
                return n3;
            }
            if (d3 == a.b.d.b) {
                this.a(n2);
                return n2;
            }
            double d9 = this.a(n3);
            if (!(d2 - d9 < (d8 = this.a(n2)) - d2)) return n2;
            return n3;
        }
        while (n < n2 - 1) {
            int n5 = (n + n2) / 2;
            d6 = this.a(n5);
            if (d2 == d6) {
                return n5;
            }
            if (d2 < d6) {
                n = n5;
                continue;
            }
            n2 = n5;
        }
        if (d3 == a.b.d.b) {
            this.a(n);
            return n;
        }
        if (d3 == a.b.d.a) {
            this.a(n2);
            return n2;
        }
        double d10 = this.a(n);
        if (!(d10 - d2 < d2 - (d4 = this.a(n2)))) return n2;
        return n;
    }

    private double a(int n, int n2) {
        double d2 = this.a(n);
        if (this.m.g()) return d2;
        d2 += (double)(n2 - 1) * this.m.d();
        return d2;
    }

    public final void g() {
        this.e = null;
        this.j = null;
        if (this.m != null) {
            this.m.i();
            this.m = null;
        }
        this.p = null;
        this.r = null;
        this.s = null;
    }
}

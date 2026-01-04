/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.A
 *  Converter.Cifp.b
 *  Converter.Cifp.b$a
 *  Converter.Cifp.c
 *  Converter.Cifp.d
 *  Converter.Cifp.e
 *  Converter.Cifp.f
 *  Converter.Cifp.i
 *  Converter.Cifp.l
 *  Converter.Cifp.p
 *  Converter.Cifp.y
 *  Converter.Cifp.z
 *  a.a.a.b
 *  a.a.a.d
 *  a.a.a.f
 *  a.b.b
 *  a.b.e
 *  a.b.f
 *  cif.dataengine.DataPath
 *  cif.dataengine.io.CategoryProperties
 *  cif.dataengine.io.LogCategory
 *  cif.dataengine.io.LogTable
 *  cif.dataengine.io.LogWell
 *  cif.dataengine.io.Logging
 *  cif.dataengine.io.LoggingPropertiesEX
 *  cif.dataengine.io.TableFields
 *  cif.dataengine.io.TableRecords
 *  cif.dataengine.io.WellProperties
 */
package Converter.Cifp;

import Converter.Cifp.A;
import Converter.Cifp.b;
import Converter.Cifp.c;
import Converter.Cifp.d;
import Converter.Cifp.e;
import Converter.Cifp.f;
import Converter.Cifp.i;
import Converter.Cifp.l;
import Converter.Cifp.p;
import Converter.Cifp.y;
import Converter.Cifp.z;
import cif.dataengine.DataPath;
import cif.dataengine.io.CategoryProperties;
import cif.dataengine.io.LogCategory;
import cif.dataengine.io.LogTable;
import cif.dataengine.io.LogWell;
import cif.dataengine.io.Logging;
import cif.dataengine.io.LoggingPropertiesEX;
import cif.dataengine.io.TableFields;
import cif.dataengine.io.TableRecords;
import cif.dataengine.io.WellProperties;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class a {
    private String a = null;
    private String b = null;
    private Date c = null;
    private f d = null;
    private List<d> e = new ArrayList<d>();
    private List<DataPath> f = new ArrayList<DataPath>();
    private String g = "meter";
    private String h;
    private String i = "";
    private WellProperties j = new WellProperties();
    private int k = -1;
    private int l;
    private boolean m = true;

    public a(f f2) {
        this.d = f2;
    }

    public final String a() {
        return this.h;
    }

    public final WellProperties b() {
        return this.j;
    }

    public final void a(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("CifpFile.setWellName():wellName is null!");
        }
        this.h = string;
    }

    public final boolean c() {
        return this.m;
    }

    public final void a(boolean bl) {
        this.m = bl;
    }

    public final void a(int n) {
        this.l = n;
    }

    public final String d() {
        return this.g;
    }

    public final void b(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("CifpFile.setDepthUnit():unit is null!");
        }
        this.g = string;
    }

    public final String e() {
        String string;
        if (this.a != null) {
            if (!this.a.isEmpty()) return this.a;
        }
        if ((string = this.d.d().substring(this.d.d().lastIndexOf(File.separator) + 1)).lastIndexOf(".") <= 0) return string;
        string = string.substring(0, string.lastIndexOf("."));
        return string;
    }

    public final f f() throws NullPointerException {
        if (this.d != null) return this.d;
        throw new NullPointerException("CifpCategory.getParent(): parent is null!");
    }

    public final List<DataPath> g() {
        return this.f;
    }

    public final void c(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("CifpCategory.setName():name is null!");
        }
        this.a = string;
    }

    public final List<d> h() {
        return this.e;
    }

    public final void a(d d2) throws IllegalArgumentException, NullPointerException {
        try {
            if (d2 == null) {
                throw new IllegalArgumentException("CifpCategory.addDataObject(): data object is null");
            }
            d2.a(this);
            this.e.add(d2);
            if (d2.h() != Converter.Cifp.e.a) return;
            Object object = this;
            object = ((a)object).g;
            ((b)d2).b((String)object);
            ((b)d2).f().a(this.d.b());
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.e.remove(d2);
            throw illegalArgumentException;
        }
        catch (NullPointerException nullPointerException) {
            this.e.remove(d2);
            throw nullPointerException;
        }
    }

    final void i() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.h = null;
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); ++i) {
                this.e.get(i).g();
            }
            this.e.clear();
            this.e = null;
        }
        if (this.f != null) {
            this.f.clear();
            this.f = null;
        }
        this.i = null;
    }

    final void a(LogWell logWell) throws IOException, IllegalArgumentException {
        int n;
        A a2;
        int n2;
        Object object;
        Object object2;
        if (logWell == null) {
            throw new IllegalArgumentException("CifpCategory.write(): logwell is null");
        }
        LogCategory logCategory = logWell.getLogCategory(this.a);
        if (logCategory == null) {
            object2 = new CategoryProperties();
            object2.setCategoryName(this.a);
            object2.setCreator(null);
            logCategory = logWell.createCategory((CategoryProperties)object2);
            object = this;
            logCategory.modifyCategoryDepthUnit(((a)object).g);
        }
        object2 = logCategory.getLogWell().getLogWorkSpace().getWorkSpaceName();
        this.j.setValue("workArea", (String)object2);
        if (this.j.getValue("wellName").isEmpty()) {
            this.j.setValue("wellName", this.h);
        }
        logCategory.getLogWell().modifyWellProperties(this.j);
        int n3 = this.e.size();
        object2 = new Vector();
        object = new Vector();
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.e.get(n2).h() == Converter.Cifp.e.a && ((b)this.e.get(n2)).b()) {
                a2 = logCategory.getLogging(this.e.get(n2).i());
                if (a2 == null) continue;
                ((Vector)object2).add(this.e.get(n2).i());
                continue;
            }
            if (this.e.get(n2).h() != Converter.Cifp.e.b) continue;
            a2 = logCategory.getLogCommonTable(this.e.get(n2).i());
            if (a2 == null) {
                a2 = logCategory.getLogParaTable(this.e.get(n2).i());
            }
            if (a2 == null) continue;
            ((Vector)object).add(this.e.get(n2).i());
        }
        n2 = 1;
        if (((Vector)object).size() > 0 && !this.d.a()) {
            a2 = new A(null, true);
            a2.a((Vector)object);
            this.k = a2.a(this.k);
            if (this.k == 10) {
                for (n = 0; n < ((Vector)object).size(); ++n) {
                    logCategory.deleteLogging((String)((Vector)object).get(n));
                }
                n2 = 1;
            } else {
                n2 = 0;
            }
        }
        this.k = -1;
        for (int i = 0; i < n3; ++i) {
            try {
                if (this.d.a()) break;
                this.d.a(0);
                n = this.d.d().lastIndexOf(92);
                object = this.d.d().substring(n + 1);
                object = ResourceBundle.getBundle("Converter/Cifp/Bundle").getString("FILE_NAME") + (String)object + "<br>" + ResourceBundle.getBundle("Converter/Cifp/Bundle").getString("CONVERTING") + this.e.get(i).i() + "   " + this.e.get(i).h().toString() + "</html>";
                this.d.a((String)object);
                if (this.e.get(i).h() == Converter.Cifp.e.a) {
                    Logging logging;
                    object = this;
                    ((b)this.e.get(i)).b(((a)object).g);
                    if (!((b)this.e.get(i)).b()) continue;
                    boolean bl = false;
                    Object object3 = logCategory.getLogging(this.e.get(i).i());
                    if (object3 == null) {
                        bl = true;
                    } else {
                        if (this.l == 0) {
                            logCategory.deleteLogging(this.e.get(i).i());
                            bl = true;
                        }
                        if (this.l == 2) {
                            bl = false;
                        }
                        if (this.l == 1) {
                            l l2 = new l(null, true);
                            l2.a((Vector)object2);
                            this.k = l2.a(this.k);
                            if (this.k == 12) {
                                l2 = new p(null, true);
                                object3 = ResourceBundle.getBundle("Converter/Cifp/Bundle").getString("CURVE_NAME") + this.e.get(i).i() + ResourceBundle.getBundle("Converter/Cifp/Bundle").getString("MESSAGE_INFO");
                                l2.a((String)object3);
                                this.k = l2.a(this.k);
                            }
                            if (this.k == 4 || this.k == 10) {
                                logCategory.deleteLogging(this.e.get(i).i());
                                bl = true;
                            } else {
                                bl = false;
                            }
                        }
                        if (this.l == 3) {
                            if (this.i == null || this.i.isEmpty()) {
                                this.i = logCategory.getNewCurveSuffix();
                            }
                            String string = this.e.get(i).i() + this.i;
                            this.e.get(i).c(string);
                            bl = true;
                        }
                    }
                    if (!bl || (logging = this.e.get(i).a(logCategory)) == null) continue;
                    this.f.add(new DataPath(logging));
                    continue;
                }
                if (this.e.get(i).h() == Converter.Cifp.e.b && n2 != 0) {
                    object = this.e.get(i).a(logCategory);
                    if (object == null) continue;
                    this.f.add(new DataPath((Logging)object));
                    continue;
                }
                object = this.e.get(i).a(logCategory);
                if (object == null) continue;
                this.f.add(new DataPath((Logging)object));
                continue;
            }
            catch (Exception exception) {}
        }
        this.k = -1;
    }

    public static byte a(a.b.b b2) {
        switch (Converter.Cifp.i.a[b2.ordinal()]) {
            case 1: {
                return 1;
            }
            case 2: {
                return 10;
            }
            case 3: {
                return 5;
            }
            case 4: {
                return 6;
            }
            case 5: {
                return 3;
            }
            case 6: {
                return 4;
            }
            case 7: {
                return 2;
            }
            case 8: {
                return 7;
            }
        }
        return 3;
    }

    static void a(a.b.f f2, Object object, byte by, b.a a2) throws IllegalArgumentException {
        int n;
        b.a a3;
        block77: {
            int n2;
            b.a a4;
            block76: {
                int n3;
                b.a a5;
                block75: {
                    int n4;
                    b.a a6;
                    block74: {
                        int n5;
                        b.a a7;
                        block73: {
                            int n6;
                            b.a a8;
                            Converter.Cifp.a.a(f2, object);
                            switch (by) {
                                case 1: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a8 = a2;
                                        object = (byte[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n6 = 0;
                                        break;
                                    }
                                    b.a a9 = a2;
                                    object = (byte[])object;
                                    Converter.Cifp.a.a(f2, object);
                                    int n7 = 0;
                                    while (n7 < ((Object)object).length) {
                                        if (f2.a((byte)object[n7])) {
                                            object[n7] = -128;
                                        } else {
                                            if (a9.a() || a9.a > (double)object[n7]) {
                                                a9.a = (double)object[n7];
                                            }
                                            if (a9.b() || a9.b < (double)object[n7]) {
                                                a9.b = (double)object[n7];
                                            }
                                        }
                                        ++n7;
                                    }
                                    return;
                                }
                                case 2: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a7 = a2;
                                        object = (short[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n5 = 0;
                                        break block73;
                                    } else {
                                        b.a a10 = a2;
                                        object = (short[])object;
                                        Converter.Cifp.a.a(f2, object);
                                        int n8 = 0;
                                        while (n8 < ((Object)object).length) {
                                            if (f2.a((short)object[n8])) {
                                                object[n8] = -32767;
                                            } else {
                                                if (a10.a() || a10.a > (double)object[n8]) {
                                                    a10.a = (double)object[n8];
                                                }
                                                if (a10.b() || a10.b < (double)object[n8]) {
                                                    a10.b = (double)object[n8];
                                                }
                                            }
                                            ++n8;
                                        }
                                        return;
                                    }
                                }
                                case 3: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a6 = a2;
                                        object = (int[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n4 = 0;
                                        break block74;
                                    } else {
                                        b.a a11 = a2;
                                        object = (int[])object;
                                        Converter.Cifp.a.a(f2, object);
                                        int n9 = 0;
                                        while (n9 < ((Object)object).length) {
                                            if (f2.a((int)object[n9])) {
                                                object[n9] = -99999;
                                            } else {
                                                if (a11.a() || a11.a > (double)object[n9]) {
                                                    a11.a = (double)object[n9];
                                                }
                                                if (a11.b() || a11.b < (double)object[n9]) {
                                                    a11.b = (double)object[n9];
                                                }
                                            }
                                            ++n9;
                                        }
                                        return;
                                    }
                                }
                                case 4: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a5 = a2;
                                        object = (long[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n3 = 0;
                                        break block75;
                                    } else {
                                        b.a a12 = a2;
                                        object = (long[])object;
                                        Converter.Cifp.a.a(f2, object);
                                        int n10 = 0;
                                        while (n10 < ((Object)object).length) {
                                            if (f2.a((float)object[n10])) {
                                                object[n10] = -99999L;
                                            } else {
                                                if (a12.a() || a12.a > (double)object[n10]) {
                                                    a12.a = (double)object[n10];
                                                }
                                                if (a12.b() || a12.b < (double)object[n10]) {
                                                    a12.b = (double)object[n10];
                                                }
                                            }
                                            ++n10;
                                        }
                                        return;
                                    }
                                }
                                case 5: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a4 = a2;
                                        object = (float[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n2 = 0;
                                        break block76;
                                    } else {
                                        b.a a13 = a2;
                                        object = (float[])object;
                                        Converter.Cifp.a.a(f2, object);
                                        int n11 = 0;
                                        while (n11 < ((Object)object).length) {
                                            if (f2.a((float)object[n11])) {
                                                object[n11] = -99999.0f;
                                            } else {
                                                if (a13.a() || a13.a > (double)object[n11]) {
                                                    a13.a = (double)object[n11];
                                                }
                                                if (a13.b() || a13.b < (double)object[n11]) {
                                                    a13.b = (double)object[n11];
                                                }
                                            }
                                            ++n11;
                                        }
                                        return;
                                    }
                                }
                                case 6: {
                                    if (Array.get(object, 0).getClass().isArray()) {
                                        a3 = a2;
                                        object = (double[][])object;
                                        Converter.Cifp.a.a(f2, object);
                                        n = 0;
                                        break block77;
                                    } else {
                                        b.a a14 = a2;
                                        object = (double[])object;
                                        Converter.Cifp.a.a(f2, object);
                                        int n12 = 0;
                                        while (n12 < ((Object)object).length) {
                                            if (f2.a((double)object[n12])) {
                                                object[n12] = -99999.0;
                                            } else {
                                                if (a14.a() || a14.a > object[n12]) {
                                                    a14.a = (double)object[n12];
                                                }
                                                if (a14.b() || a14.b < object[n12]) {
                                                    a14.b = (double)object[n12];
                                                }
                                            }
                                            ++n12;
                                        }
                                        return;
                                    }
                                }
                                default: {
                                    return;
                                }
                            }
                            while (n6 < ((Object)object).length) {
                                for (int j = 0; j < ((Object)object[n6]).length; ++j) {
                                    if (f2.a((byte)object[n6][j])) {
                                        object[n6][j] = -128;
                                        continue;
                                    }
                                    if (a8.a() || a8.a > (double)object[n6][j]) {
                                        a8.a = (double)object[n6][j];
                                    }
                                    if (!a8.b() && !(a8.b < (double)object[n6][j])) continue;
                                    a8.b = (double)object[n6][j];
                                }
                                ++n6;
                            }
                            return;
                        }
                        while (n5 < ((Object)object).length) {
                            for (int j = 0; j < ((Object)object[n5]).length; ++j) {
                                if (f2.a((short)object[n5][j])) {
                                    object[n5][j] = -32767;
                                    continue;
                                }
                                if (a7.a() || a7.a > (double)object[n5][j]) {
                                    a7.a = (double)object[n5][j];
                                }
                                if (!a7.b() && !(a7.b < (double)object[n5][j])) continue;
                                a7.b = (double)object[n5][j];
                            }
                            ++n5;
                        }
                        return;
                    }
                    while (n4 < ((Object)object).length) {
                        for (int j = 0; j < ((Object)object[n4]).length; ++j) {
                            if (f2.a((int)object[n4][j])) {
                                object[n4][j] = -99999;
                                continue;
                            }
                            if (a6.a() || a6.a > (double)object[n4][j]) {
                                a6.a = (double)object[n4][j];
                            }
                            if (!a6.b() && !(a6.b < (double)object[n4][j])) continue;
                            a6.b = (double)object[n4][j];
                        }
                        ++n4;
                    }
                    return;
                }
                while (n3 < ((Object)object).length) {
                    for (int j = 0; j < ((Object)object[n3]).length; ++j) {
                        if (f2.a((float)object[n3][j])) {
                            object[n3][j] = -99999L;
                            continue;
                        }
                        if (a5.a() || a5.a > (double)object[n3][j]) {
                            a5.a = (double)object[n3][j];
                        }
                        if (!a5.b() && !(a5.b < (double)object[n3][j])) continue;
                        a5.b = (double)object[n3][j];
                    }
                    ++n3;
                }
                return;
            }
            while (n2 < ((Object)object).length) {
                for (int j = 0; j < ((Object)object[n2]).length; ++j) {
                    if (f2.a((float)object[n2][j])) {
                        object[n2][j] = -99999.0f;
                        continue;
                    }
                    if (a4.a() || a4.a > (double)object[n2][j]) {
                        a4.a = (double)object[n2][j];
                    }
                    if (!a4.b() && !(a4.b < (double)object[n2][j])) continue;
                    a4.b = (double)object[n2][j];
                }
                ++n2;
            }
            return;
        }
        while (n < ((Object)object).length) {
            for (int j = 0; j < ((Object)object[n]).length; ++j) {
                if (f2.a((double)object[n][j])) {
                    object[n][j] = -99999.0;
                    continue;
                }
                if (a3.a() || a3.a > object[n][j]) {
                    a3.a = (double)object[n][j];
                }
                if (!a3.b() && !(a3.b < object[n][j])) continue;
                a3.b = (double)object[n][j];
            }
            ++n;
        }
    }

    private static void a(a.b.f f2, Object object) {
        if (f2 == null) {
            throw new IllegalArgumentException("CifpCurve.modifyNullValue():nullValueManager is null!");
        }
        if (object != null) return;
        throw new IllegalArgumentException("CifpCurve.modifyNullValue():array is null!");
    }

    public static b a(a.a.a.b b2, a.a.a.d object) throws Exception {
        double d2;
        Object object2 = new a.b.e();
        new a.b.e().a = b2;
        b b3 = new b();
        b3.a((a.b.e)object2);
        b3.c(b2.y());
        object2 = object.r();
        if (object2 == null || ((String)object2).isEmpty()) {
            object2 = object.j();
        }
        double d3 = b2.C();
        double d4 = b2.w();
        double d5 = b2.B();
        object = Math.abs(d2) > 0.0 ? (d5 > 0.0 ? new y(z.a, (String)object2, Math.min(d3, d4), Math.max(d3, d4), d5) : new y(z.a, (String)object2, Math.max(d3, d4), Math.min(d3, d4), d5)) : new y(z.a, (String)object2, Math.min(d3, d4), Math.max(d3, d4), d5);
        b3.a((y)object);
        b3.a(b2.D());
        b3.a((byte)a.a.a.f.b((int)b2.u()).a());
        object = new int[1];
        b3.a((int[])object);
        b3.a()[0] = b2.v();
        if (b2.v() == 1) {
            b3.a(Converter.Cifp.c.a);
        } else if (b2.v() > 1) {
            b3.a(Converter.Cifp.c.b);
        }
        object = new TableFields();
        object.init(28);
        object.setName(0, "Source_cls");
        object.setName(1, "Units_cls");
        object.setName(2, "GenericName_cls");
        object.setName(3, "CurveNature_cls");
        object.setName(4, "LISMnemonic_cls");
        object.setName(5, "LISTapeChannel_cls");
        object.setName(6, "Direction_cls");
        object.setName(7, "ProgramVersion_cls");
        object.setName(8, "APILogType_cls");
        object.setName(9, "APICurveType_cls");
        object.setName(10, "APICurveClass_cls");
        object.setName(11, "APIModifier_cls");
        object.setName(12, "UpperLimit_cls");
        object.setName(13, "LowerLimit_cls");
        object.setName(14, "Scale_cls");
        object.setName(15, "Remarks_cls");
        object.setName(16, "Value1_cls");
        object.setName(17, "Value2_cls");
        object.setName(18, "Value3_cls");
        object.setName(19, "Value4_cls");
        object.setName(20, "Value5_cls");
        object.setName(21, "Value6_cls");
        object.setName(22, "Value7_cls");
        object.setName(23, "Value8_cls");
        object.setName(24, "Value9_cls");
        object.setName(25, "Value10_cls");
        object.setName(26, "Value11_cls");
        object.setName(27, "ID_cls");
        object.setDataType(0, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(1, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(2, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(3, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(4, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(5, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(6, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(7, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(8, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(9, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(10, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(11, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(12, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(13, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(14, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(15, Converter.Cifp.a.a(a.b.b.h));
        object.setDataType(16, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(17, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(18, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(19, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(20, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(21, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(22, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(23, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(24, Converter.Cifp.a.a(a.b.b.f));
        object.setDataType(25, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(26, Converter.Cifp.a.a(a.b.b.d));
        object.setDataType(27, Converter.Cifp.a.a(a.b.b.d));
        object2 = new TableRecords();
        object2.init(1, (TableFields)object);
        object2.setRecordStringData(0, 0, b2.A());
        object2.setRecordStringData(0, 1, b2.D());
        object2.setRecordStringData(0, 3, b2.z());
        object2.setRecordStringData(0, 4, b2.x());
        object2.setRecordIntData(0, 5, b2.m());
        object2.setRecordIntData(0, 6, b2.F());
        object2.setRecordStringData(0, 7, b2.E());
        object2.setRecordIntData(0, 8, b2.n());
        object2.setRecordIntData(0, 9, b2.o());
        object2.setRecordIntData(0, 10, b2.p());
        object2.setRecordIntData(0, 11, b2.q());
        object2.setRecordFloatData(0, 12, b2.r());
        object2.setRecordFloatData(0, 13, b2.s());
        object2.setRecordIntData(0, 14, b2.G());
        object2.setRecordStringData(0, 15, b2.t());
        object2.setRecordIntData(0, 16, b2.g());
        object2.setRecordIntData(0, 17, b2.h());
        object2.setRecordFloatData(0, 18, b2.i());
        object2.setRecordFloatData(0, 19, b2.j());
        object2.setRecordFloatData(0, 20, b2.k());
        object2.setRecordIntData(0, 21, b2.l());
        object2.setRecordFloatData(0, 22, b2.d());
        object2.setRecordFloatData(0, 23, b2.e());
        object2.setRecordFloatData(0, 24, b2.f());
        object2.setRecordIntData(0, 25, b2.b());
        object2.setRecordIntData(0, 26, b2.c());
        object2.setRecordIntData(0, 27, b2.a());
        b2 = new LoggingPropertiesEX((TableRecords)object2);
        b3.a((LoggingPropertiesEX)b2);
        return b3;
    }

    public static int a(int n, int n2, int n3, int n4, int n5) {
        n2 *= n3;
        int n6 = 0;
        if (n == 67109826 || n == 67109825) {
            if (n2 % 2 == 0 && n4 % 2 == 0 || n2 % 2 == 1 && n4 % 2 == 1) {
                n = n5 * n3 / 2;
                n6 = n5 * n3 % 2 == 0 ? n : n + 1;
            } else {
                if (n2 % 2 != 0 || n4 % 2 != 1) {
                    if (n2 % 2 != 1) return n6;
                    if (n4 % 2 != 0) return n6;
                }
                n = (n5 * n3 - 1) / 2;
                n6 = (n5 * n3 - 1) % 2 == 0 ? n + 1 : n + 2;
            }
        } else if (n == 0x4000402 || n == 0x4000401) {
            if (n2 % 4 == 0 && n4 % 4 == 0 || n2 % 4 == 1 && n4 % 4 == 1 || n2 % 4 == 2 && n4 % 4 == 2 || n2 % 4 == 3 && n4 % 4 == 3) {
                n = n5 * n3 / 4;
                n6 = n5 * n3 % 4 == 0 ? n : n + 1;
            } else if (n2 % 4 == 0 && n4 % 4 == 1 || n2 % 4 == 1 && n4 % 4 == 2 || n2 % 4 == 2 && n4 % 4 == 3 || n2 % 4 == 3 && n4 % 4 == 0) {
                n = (n5 * n3 - 3) / 4;
                n6 = (n5 * n3 - 3) % 4 == 0 ? n + 1 : n + 2;
            } else if (n2 % 4 == 0 && n4 % 4 == 2 || n2 % 4 == 1 && n4 % 4 == 3 || n2 % 4 == 2 && n4 % 4 == 0 || n2 % 4 == 3 && n4 % 4 == 1) {
                n = (n5 * n3 - 2) / 4;
                n6 = (n5 * n3 - 2) % 4 == 0 ? n + 1 : n + 2;
            } else {
                if (!(n2 % 4 == 0 && n4 % 4 == 3 || n2 % 4 == 1 && n4 % 4 == 0 || n2 % 4 == 2 && n4 % 4 == 1)) {
                    if (n2 % 4 != 3) return n6;
                    if (n4 % 4 != 2) return n6;
                }
                n = (n5 * n3 - 1) / 4;
                n6 = (n5 * n3 - 1) % 4 == 0 ? n + 1 : n + 2;
            }
        } else if (n == 0x4000442 || n == 0x4000441) {
            if (n2 % 8 == 0 && n4 % 8 == 0 || n2 % 8 == 1 && n4 % 8 == 1 || n2 % 8 == 2 && n4 % 8 == 2 || n2 % 8 == 3 && n4 % 8 == 3 || n2 % 8 == 4 && n4 % 8 == 4 || n2 % 8 == 5 && n4 % 8 == 5 || n2 % 8 == 6 && n4 % 8 == 6 || n2 % 8 == 7 && n4 % 8 == 7) {
                n = n5 * n3 / 8;
                n6 = n5 * n3 % 8 == 0 ? n : n + 1;
            } else if (n2 % 8 == 0 && n4 % 8 == 1 || n2 % 8 == 1 && n4 % 8 == 2 || n2 % 8 == 2 && n4 % 8 == 3 || n2 % 8 == 3 && n4 % 8 == 4 || n2 % 8 == 4 && n4 % 8 == 5 || n2 % 8 == 5 && n4 % 8 == 6 || n2 % 8 == 6 && n4 % 8 == 7 || n2 % 8 == 7 && n4 % 8 == 0) {
                n = (n5 * n3 - 7) / 8;
                n6 = (n5 * n3 - 7) % 8 == 0 ? n + 1 : n + 2;
            } else if (n2 % 8 == 0 && n4 % 8 == 2 || n2 % 8 == 1 && n4 % 8 == 3 || n2 % 8 == 2 && n4 % 8 == 4 || n2 % 8 == 3 && n4 % 8 == 5 || n2 % 8 == 4 && n4 % 8 == 6 || n2 % 8 == 5 && n4 % 8 == 7 || n2 % 8 == 6 && n4 % 8 == 0 || n2 % 8 == 7 && n4 % 8 == 1) {
                n = (n5 * n3 - 6) / 8;
                n6 = (n5 * n3 - 6) % 8 == 0 ? n + 1 : n + 2;
            } else if (n2 % 8 == 0 && n4 % 8 == 3 || n2 % 8 == 1 && n4 % 8 == 4 || n2 % 8 == 2 && n4 % 8 == 5 || n2 % 8 == 3 && n4 % 8 == 6 || n2 % 8 == 4 && n4 % 8 == 7 || n2 % 8 == 5 && n4 % 8 == 0 || n2 % 8 == 6 && n4 % 8 == 1 || n2 % 8 == 7 && n4 % 8 == 2) {
                n = (n5 * n3 - 5) / 8;
                n6 = (n5 * n3 - 5) % 8 == 0 ? n + 1 : n + 2;
            } else if (n2 % 8 == 0 && n4 % 8 == 4 || n2 % 8 == 1 && n4 % 8 == 5 || n2 % 8 == 2 && n4 % 8 == 6 || n2 % 8 == 3 && n4 % 8 == 7 || n2 % 8 == 4 && n4 % 8 == 0 || n2 % 8 == 5 && n4 % 8 == 1 || n2 % 8 == 6 && n4 % 8 == 2 || n2 % 8 == 7 && n4 % 8 == 3) {
                n = (n5 * n3 - 4) / 8;
                n6 = (n5 * n3 - 4) % 8 == 0 ? n + 1 : n + 2;
            } else if (n2 % 8 == 0 && n4 % 8 == 5 || n2 % 8 == 1 && n4 % 8 == 6 || n2 % 8 == 2 && n4 % 8 == 7 || n2 % 8 == 3 && n4 % 8 == 0 || n2 % 8 == 4 && n4 % 8 == 1 || n2 % 8 == 5 && n4 % 8 == 2 || n2 % 8 == 6 && n4 % 8 == 3 || n2 % 8 == 7 && n4 % 8 == 4) {
                n = (n5 * n3 - 3) / 8;
                n6 = (n5 * n3 - 3) % 8 == 0 ? n + 1 : n + 2;
            } else if (n2 % 8 == 0 && n4 % 8 == 6 || n2 % 8 == 1 && n4 % 8 == 7 || n2 % 8 == 2 && n4 % 8 == 0 || n2 % 8 == 3 && n4 % 8 == 1 || n2 % 8 == 4 && n4 % 8 == 2 || n2 % 8 == 5 && n4 % 8 == 3 || n2 % 8 == 6 && n4 % 8 == 4 || n2 % 8 == 7 && n4 % 8 == 5) {
                n = (n5 * n3 - 2) / 8;
                n6 = (n5 * n3 - 2) % 8 == 0 ? n + 1 : n + 2;
            } else {
                if (!(n2 % 8 == 0 && n4 % 8 == 7 || n2 % 8 == 1 && n4 % 8 == 0 || n2 % 8 == 2 && n4 % 8 == 1 || n2 % 8 == 3 && n4 % 8 == 2 || n2 % 8 == 4 && n4 % 8 == 3 || n2 % 8 == 5 && n4 % 8 == 4 || n2 % 8 == 6 && n4 % 8 == 5)) {
                    if (n2 % 8 != 7) return n6;
                    if (n4 % 8 != 6) return n6;
                }
                n = (n5 * n3 - 1) / 8;
                n6 = (n5 * n3 - 1) % 8 == 0 ? n + 1 : n + 2;
            }
        } else {
            n6 = (int)((double)((float)n5 * a.a.a.f.a((int)n) * (float)n3) + 0.5);
        }
        return n6;
    }

    public static String a(a object, e e2, String string) throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException("ConverterHelper.CreateUniqueDataObjectNameForCifp():category is null!");
        }
        if (string == null) {
            throw new IllegalArgumentException("ConverterHelper.CreateUniqueDataObjectNameForCifp():nameSeed is null!");
        }
        String string2 = string.trim();
        object = ((a)object).e;
        int n = 0;
        while (n < 9999) {
            boolean bl = false;
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                d d2 = (d)iterator.next();
                if (d2.h() != e2 || !d2.i().equalsIgnoreCase(string2)) continue;
                bl = true;
                break;
            }
            if (!bl) return string2;
            string2 = string + Integer.toString(n);
            ++n;
        }
        return string2;
    }

    public static String a(LogCategory logCategory, String string) throws IllegalArgumentException {
        if (logCategory == null) {
            throw new IllegalArgumentException("ConverterHelper.CreateUniqueDataObjectNameForCifp():category is null!");
        }
        if (string == null) {
            throw new IllegalArgumentException("ConverterHelper.CreateUniqueDataObjectNameForCifp():nameSeed is null!");
        }
        String string2 = string.trim();
        int n = 0;
        while (n < 9999) {
            boolean bl = false;
            LogTable logTable = logCategory.getLogCommonTable(string2);
            if (logTable == null) {
                logTable = logCategory.getLogParaTable(string2);
            }
            if (logTable != null) {
                bl = true;
            }
            if (!bl) return string2;
            string2 = string + Integer.toString(n);
            ++n;
        }
        return string2;
    }

    public static int a(byte[] byArray) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (n3 < 4) {
            n2 <<= 8;
            n = byArray[3 - n3] & 0xFF;
            n2 |= n;
            ++n3;
        }
        return n2;
    }

    public static byte[] b(int n) {
        byte[] byArray = new byte[4];
        int n2 = 0;
        while (n2 < 4) {
            byArray[3 - n2] = (byte)(n >>> 24 - (n2 << 3));
            ++n2;
        }
        return byArray;
    }

    public static short b(byte[] byArray) {
        short s = 0;
        short s2 = 0;
        int n = 0;
        while (n < 2) {
            s2 = (short)(s2 << 8);
            s = (short)(byArray[1 - n] & 0xFF);
            s2 = (short)(s2 | s);
            ++n;
        }
        return s2;
    }

    public static int c(byte[] byArray) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (n3 < 2) {
            n2 <<= 8;
            n = byArray[1 - n3] & 0xFF;
            n2 |= n;
            ++n3;
        }
        return n2;
    }

    public static double d(byte[] byArray) {
        long l2 = 0L;
        long l3 = 0L;
        int n = 0;
        while (n < 8) {
            l3 <<= 8;
            l2 = byArray[7 - n] & 0xFF;
            l3 |= l2;
            ++n;
        }
        return Double.longBitsToDouble(l3);
    }

    public static byte[] a(short s) {
        byte[] byArray = new byte[2];
        int n = 0;
        while (n < 2) {
            byArray[1 - n] = (byte)(s >>> 8 - (n << 3));
            ++n;
        }
        return byArray;
    }

    public static byte[] c(int n) {
        byte[] byArray = new byte[2];
        int n2 = 0;
        while (n2 < 2) {
            byArray[1 - n2] = (byte)(n >>> 8 - (n2 << 3));
            ++n2;
        }
        return byArray;
    }

    public static byte[] a(long l2) {
        byte[] byArray = new byte[8];
        int n = 0;
        while (n < 8) {
            byArray[7 - n] = (byte)(l2 >>> 56 - (n << 3));
            ++n;
        }
        return byArray;
    }

    public static void e(byte[] byArray) {
        byte by = byArray[0];
        byArray[0] = byArray[1];
        byArray[1] = by;
    }

    public static void f(byte[] byArray) {
        byte by = byArray[0];
        byArray[0] = byArray[3];
        byArray[3] = by;
        by = byArray[1];
        byArray[1] = byArray[2];
        byArray[2] = by;
    }

    public static String d(String string) throws IllegalArgumentException {
        int n;
        if (string == null) {
            throw new IllegalArgumentException("ConverterHelper.trimNameString():name is null!");
        }
        char[] cArray = new char[]{'\u0000', ' ', '\n', '\r', '-'};
        string = string.trim();
        int n2 = -1;
        for (int j = 0; j < cArray.length; ++j) {
            n = string.indexOf(cArray[j]);
            if (n <= 0) continue;
            if (n2 < 0) {
                n2 = n;
                continue;
            }
            if (n >= n2) continue;
            n2 = n;
        }
        if (n2 > 0 && n2 < string.length() - 1) {
            string = new String(string.substring(0, n2));
        }
        StringBuffer stringBuffer = new StringBuffer(string);
        n = 0;
        while (n < string.length()) {
            char c2 = stringBuffer.charAt(n);
            if ((c2 & 0xF000) != 0 && (c2 < '\u4e00' || c2 > '\u9fa5')) {
                stringBuffer.deleteCharAt(n);
                --n;
            }
            string = stringBuffer.toString();
            ++n;
        }
        return string;
    }
}

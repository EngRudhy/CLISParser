/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.b
 *  Converter.Cifp.d
 *  Converter.Cifp.e
 *  Converter.Cifp.f
 *  a.b.b
 *  a.b.c
 *  cif.dataengine.DataPath
 *  cif.formatconversion.ConversionParameters
 */
package a.b;

import Converter.Cifp.d;
import Converter.Cifp.e;
import Converter.Cifp.f;
import a.b.b;
import a.b.c;
import cif.dataengine.DataPath;
import cif.formatconversion.ConversionParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class a {
    protected String a;
    protected f b = null;

    public StringBuffer c() throws Exception {
        throw new Exception("ConverterBase.fileScan(): Method not override!");
    }

    public final String a(int n) throws NullPointerException {
        if (this.b != null) return ((Converter.Cifp.a)this.b.e().get(n)).d();
        throw new NullPointerException("CoverterBase.getDepthUnit():_cifpFile is null!");
    }

    public final String b(int n) throws NullPointerException {
        if (this.b != null) return ((Converter.Cifp.a)this.b.e().get(n)).a();
        throw new NullPointerException("CoverterBase.getWellName():_cifpFile is null!");
    }

    public final DataPath[] c(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getDataPaths():_cifpFile is null!");
        }
        DataPath[] dataPathArray = new DataPath[((Converter.Cifp.a)this.b.e().get(n)).g().size()];
        ((Converter.Cifp.a)this.b.e().get(n)).g().toArray(dataPathArray);
        return dataPathArray;
    }

    public final String[] d(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getCurveNames():_cifpFile is null!");
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        object = object.h().iterator();
        while (true) {
            if (!object.hasNext()) {
                object = new String[arrayList.size()];
                arrayList.toArray((T[])object);
                return object;
            }
            d d2 = (d)object.next();
            if (d2.h() != e.a) continue;
            arrayList.add(d2.i());
        }
    }

    public final String[] e(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getCurveUnits():_cifpFile is null!");
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        object = object.h().iterator();
        while (true) {
            if (!object.hasNext()) {
                object = new String[arrayList.size()];
                arrayList.toArray((T[])object);
                return object;
            }
            d d2 = (d)object.next();
            if (d2.h() != e.a) continue;
            arrayList.add(((Converter.Cifp.b)d2).c());
        }
    }

    public final double f(int n) throws NullPointerException, IndexOutOfBoundsException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getStartDepth():_cifpFile is null!");
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Converter.Cifp.a a2 = (Converter.Cifp.a)this.b.e().get(n);
        for (d d2 : a2.h()) {
            double d3;
            if (d2.h() != e.a) continue;
            if (((Converter.Cifp.b)d2).f().f()) {
                d3 = ((Converter.Cifp.b)d2).f().g() ? ((Converter.Cifp.b)d2).f().b() : ((Converter.Cifp.b)d2).f().c();
            } else if (((Converter.Cifp.b)d2).f().g()) {
                d3 = ((Converter.Cifp.b)d2).f().e()[0];
            } else {
                int n2 = ((Converter.Cifp.b)d2).f().e().length;
                d3 = ((Converter.Cifp.b)d2).f().e()[n2 - 1];
            }
            arrayList.add(d3);
        }
        if (arrayList.size() <= 0) {
            throw new IndexOutOfBoundsException("ConverterBase.getStartDepth():startDepths size is 0!");
        }
        Collections.sort(arrayList);
        return (Double)arrayList.get(0);
    }

    public final double g(int n) throws NullPointerException, IndexOutOfBoundsException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getEndDepth():_cifpFile is null!");
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Converter.Cifp.a a2 = (Converter.Cifp.a)this.b.e().get(n);
        for (d d2 : a2.h()) {
            double d3;
            if (d2.h() != e.a) continue;
            if (((Converter.Cifp.b)d2).f().f()) {
                d3 = ((Converter.Cifp.b)d2).f().g() ? ((Converter.Cifp.b)d2).f().c() : ((Converter.Cifp.b)d2).f().b();
            } else if (!((Converter.Cifp.b)d2).f().g()) {
                d3 = ((Converter.Cifp.b)d2).f().e()[0];
            } else {
                int n2 = ((Converter.Cifp.b)d2).f().e().length;
                d3 = ((Converter.Cifp.b)d2).f().e()[n2 - 1];
            }
            arrayList.add(d3);
        }
        if (arrayList.size() <= 0) {
            throw new IndexOutOfBoundsException("ConverterBase.getEndDepth():endDepths size is 0!");
        }
        Collections.sort(arrayList);
        return (Double)arrayList.get(arrayList.size() - 1);
    }

    public final double[] h(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getDepthLevels():_cifpFile is null!");
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        for (d d2 : object.h()) {
            if (d2.h() != e.a) continue;
            arrayList.add(((Converter.Cifp.b)d2).f().d());
        }
        object = new double[arrayList.size()];
        int n2 = 0;
        while (n2 < arrayList.size()) {
            object[n2] = (Converter.Cifp.a)((Double)arrayList.get(n2));
            ++n2;
        }
        return object;
    }

    public final double[] i(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getRightScales():_cifpFile is null!");
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        for (d d2 : object.h()) {
            if (d2.h() != e.a) continue;
            arrayList.add(((Converter.Cifp.b)d2).e());
        }
        object = new double[arrayList.size()];
        int n2 = 0;
        while (n2 < arrayList.size()) {
            object[n2] = (Converter.Cifp.a)((Double)arrayList.get(n2));
            ++n2;
        }
        return object;
    }

    public final double[] j(int n) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.getLeftScales():_cifpFile is null!");
        }
        ArrayList<Double> arrayList = new ArrayList<Double>();
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        for (d d2 : object.h()) {
            if (d2.h() != e.a) continue;
            arrayList.add(((Converter.Cifp.b)d2).d());
        }
        object = new double[arrayList.size()];
        int n2 = 0;
        while (n2 < arrayList.size()) {
            object[n2] = (Converter.Cifp.a)((Double)arrayList.get(n2));
            ++n2;
        }
        return object;
    }

    public final void a(int n, ConversionParameters conversionParameters) throws NullPointerException {
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.setParameters():_cifpFile is null!");
        }
        ((Converter.Cifp.a)this.b.e().get(n)).a(conversionParameters.getWellName());
        ((Converter.Cifp.a)this.b.e().get(n)).c(conversionParameters.getCatagoryName());
        String[] stringArray = this.d(n);
        int n2 = stringArray.length;
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                this.b.b().a(conversionParameters.getNullValues());
                ((Converter.Cifp.a)this.b.e().get(n)).a(conversionParameters.getOverWriteType());
                ((Converter.Cifp.a)this.b.e().get(n)).a(conversionParameters.isAutoComputeLeftAndRightScale());
                return;
            }
            int n4 = a.b.a.a(conversionParameters, stringArray[n3]);
            Converter.Cifp.b b2 = this.a(n, stringArray[n3]);
            if (n4 >= 0) {
                b2.c(conversionParameters.getCurveOutputName(n4));
                b2.a(conversionParameters.getLeftScale(n4));
                b2.b(conversionParameters.getRightScale(n4));
                b2.a(conversionParameters.getCurveOutputUnit(n4));
                b2.a(conversionParameters.getCurveIsSelected(n4));
            }
            b2.a(conversionParameters.getOutputStdep());
            b2.b(conversionParameters.getOutputEndep());
            ++n3;
        }
    }

    private static int a(ConversionParameters conversionParameters, String string) {
        if (conversionParameters == null) {
            return -1;
        }
        int n = conversionParameters.getCurveNumber();
        int n2 = 0;
        while (n2 < n) {
            if (string.trim().equalsIgnoreCase(conversionParameters.getCurveName(n2).trim())) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public final int d() {
        if (this.b != null) return this.b.e().size();
        throw new NullPointerException("CoverterBase.setParameters():_cifpFile is null!");
    }

    public final String k(int n) {
        if (this.b != null) return ((Converter.Cifp.a)this.b.e().get(n)).e();
        throw new NullPointerException("CoverterBase.setParameters():_cifpFile is null!");
    }

    private Converter.Cifp.b a(int n, String string) throws NullPointerException, IllegalArgumentException {
        d d2;
        if (this.b == null) {
            throw new NullPointerException("CoverterBase.findCurve():_cifpFile is null!");
        }
        Object object = (Converter.Cifp.a)this.b.e().get(n);
        object = object.h().iterator();
        do {
            if (!object.hasNext()) return null;
        } while ((d2 = (d)object.next()).h() != e.a || !d2.i().equalsIgnoreCase(string));
        return (Converter.Cifp.b)d2;
    }

    public final void e() throws IOException {
        if (this.b == null) return;
        this.b.f();
        this.b = null;
    }

    public static Object a(b b2, int n) {
        switch (c.a[b2.ordinal()]) {
            case 1: {
                return new byte[n];
            }
            case 2: {
                return new short[n];
            }
            case 3: {
                return new int[n];
            }
            case 4: {
                return new long[n];
            }
            case 5: {
                return new float[n];
            }
            case 6: {
                return new double[n];
            }
            case 7: {
                return new String[n];
            }
        }
        return null;
    }

    public static Object a(b b2, int n, int n2) {
        switch (c.a[b2.ordinal()]) {
            case 1: {
                return new byte[n][n2];
            }
            case 2: {
                return new short[n][n2];
            }
            case 3: {
                return new int[n][n2];
            }
            case 4: {
                return new long[n][n2];
            }
            case 5: {
                return new float[n][n2];
            }
            case 6: {
                return new double[n][n2];
            }
            case 7: {
                return new String[n][n2];
            }
        }
        return null;
    }

    public static int a(byte by) {
        switch (by) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 8;
            }
            case 5: {
                return 4;
            }
            case 6: {
                return 8;
            }
        }
        return -1;
    }
}

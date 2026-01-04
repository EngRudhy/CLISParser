/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a.b.a.b
 *  a.b.a.c
 *  a.b.a.d
 */
package a.b.a;

import a.b.a.b;
import a.b.a.c;
import a.b.a.d;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private List<b> a = new ArrayList<b>();
    private List<c> b = new ArrayList<c>();
    private b c;
    private b d;
    private double e;
    private double f;

    public a() throws Exception {
        b b2 = new b("Meter", "meter", a.b.a.d.a, "Meter");
        b2.b("Meter");
        b2.b("Meters");
        b2.b("m");
        b b3 = new b("Decimeter", "dm", a.b.a.d.a, "Decimeter");
        b b4 = new b("Centimeter", "cm", a.b.a.d.a, "Centimeter");
        b b5 = new b("Millimeter", "mm", a.b.a.d.a, "Millimeter");
        b b6 = new b("Foot", "feet", a.b.a.d.b, "Foot");
        b6.b("foot");
        b6.b("feet");
        b6.b("F");
        b6.b("ft");
        b b7 = new b("Inch", "in", a.b.a.d.b, "Inch");
        b7.b("inch");
        b7.b("inches");
        b7.b("inchs");
        b b8 = new b("0.1 Inch", "0.1in", a.b.a.d.b, "0.1 inch");
        b8.b("0.1inch");
        b8.b(".1in");
        b8.b(".1inch");
        b8.b("0.1 in");
        b b9 = new b("Second", "s", a.b.a.d.a, "Second");
        b9.b("second");
        b b10 = new b("Millisecond", "ms", a.b.a.d.a, "Millisecond");
        b10.b("millisecond");
        b b11 = new b("Microsecond", "us", a.b.a.d.a, "Microsecond");
        b11.b("microsecond");
        b b12 = new b("Nanosecond", "ns", a.b.a.d.a, "Nanosecond");
        b12.b("nanosecond");
        b b13 = new b("Minute", "min", a.b.a.d.a, "Minute");
        b13.b("minute");
        this.a.add(b2);
        this.a.add(b3);
        this.a.add(b4);
        this.a.add(b5);
        this.a.add(b6);
        this.a.add(b7);
        this.a.add(b8);
        this.a.add(b9);
        this.a.add(b10);
        this.a.add(b11);
        this.a.add(b12);
        this.a.add(b13);
        this.b.add(new c(b2, b2, 1.0));
        this.b.add(new c(b2, b3, 10.0));
        this.b.add(new c(b2, b4, 100.0));
        this.b.add(new c(b2, b5, 1000.0));
        this.b.add(new c(b2, b6, 3.280839895013123));
        this.b.add(new c(b2, b7, 39.37007874015748));
        this.b.add(new c(b2, b8, 393.7007874015748));
        this.b.add(new c(b3, b2, 0.1));
        this.b.add(new c(b3, b3, 1.0));
        this.b.add(new c(b3, b4, 10.0));
        this.b.add(new c(b3, b5, 100.0));
        this.b.add(new c(b3, b6, 0.32808398950131235));
        this.b.add(new c(b3, b7, 3.9370078740157486));
        this.b.add(new c(b3, b8, 39.37007874015748));
        this.b.add(new c(b4, b2, 0.01));
        this.b.add(new c(b4, b3, 0.1));
        this.b.add(new c(b4, b4, 1.0));
        this.b.add(new c(b4, b5, 10.0));
        this.b.add(new c(b4, b6, 0.03280839895013123));
        this.b.add(new c(b4, b7, 0.3937007874015748));
        this.b.add(new c(b4, b8, 3.9370078740157486));
        this.b.add(new c(b6, b2, 0.3048));
        this.b.add(new c(b6, b3, 3.048));
        this.b.add(new c(b6, b4, 30.48));
        this.b.add(new c(b6, b5, 304.8));
        this.b.add(new c(b6, b6, 1.0));
        this.b.add(new c(b6, b7, 12.0));
        this.b.add(new c(b6, b8, 120.0));
        this.b.add(new c(b7, b2, 0.0254));
        this.b.add(new c(b7, b3, 0.254));
        this.b.add(new c(b7, b4, 2.54));
        this.b.add(new c(b7, b5, 25.4));
        this.b.add(new c(b7, b6, 0.08333333333333333));
        this.b.add(new c(b7, b7, 1.0));
        this.b.add(new c(b7, b8, 10.0));
        this.b.add(new c(b8, b2, 0.0025399999999999997));
        this.b.add(new c(b8, b3, 0.0254));
        this.b.add(new c(b8, b4, 0.254));
        this.b.add(new c(b8, b4, 2.54));
        this.b.add(new c(b8, b6, 0.008333333333333333));
        this.b.add(new c(b8, b7, 0.1));
        this.b.add(new c(b8, b8, 1.0));
        this.b.add(new c(b9, b9, 1.0));
        this.b.add(new c(b9, b10, 1000.0));
        this.b.add(new c(b9, b11, 1000000.0));
        this.b.add(new c(b9, b12, 1.0E9));
        this.b.add(new c(b9, b13, 0.016666666666666666));
        this.b.add(new c(b10, b9, 0.001));
        this.b.add(new c(b10, b10, 1.0));
        this.b.add(new c(b10, b11, 1000.0));
        this.b.add(new c(b10, b12, 1000000.0));
        this.b.add(new c(b10, b13, 1.6666666666666667E-5));
        this.b.add(new c(b11, b9, 1.0E-6));
        this.b.add(new c(b11, b10, 0.001));
        this.b.add(new c(b11, b11, 1.0));
        this.b.add(new c(b11, b12, 1000.0));
        this.b.add(new c(b11, b13, 1.6666666666666667E-8));
        this.b.add(new c(b12, b9, 1.0E-9));
        this.b.add(new c(b12, b10, 1.0E-6));
        this.b.add(new c(b12, b11, 0.001));
        this.b.add(new c(b12, b12, 1.0));
        this.b.add(new c(b12, b13, 1.6666666666666667E-11));
        this.b.add(new c(b13, b9, 60.0));
        this.b.add(new c(b13, b10, 60000.0));
        this.b.add(new c(b13, b11, 6.0E7));
        this.b.add(new c(b13, b12, -1.29542144E8));
        this.b.add(new c(b13, b13, 1.0));
    }

    private b c(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("UnitDepth.findUnitInfo():unitNotation is null!");
        }
        int n = 0;
        while (n < this.a.size()) {
            if (this.a.get(n).a(string)) {
                return this.a.get(n);
            }
            ++n;
        }
        return null;
    }

    public final String a(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("UnitDepth.getFormalUnitNotation():unitNotation is null!");
        }
        if ((string = this.c(string)) == null) return "";
        return string.a();
    }

    public final boolean b(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("UnitDepth.isTimeUnit():unitNotation is null!");
        }
        if ((string = this.c(string)) == null) return false;
        if (string.a().equalsIgnoreCase("s")) return true;
        if (string.a().equalsIgnoreCase("ms")) return true;
        if (string.a().equalsIgnoreCase("us")) return true;
        if (string.a().equalsIgnoreCase("ns")) return true;
        if (!string.a().equalsIgnoreCase("min")) return false;
        return true;
    }

    public final double a(String object, String string, double d2) {
        String string2 = string;
        String string3 = object;
        object = this;
        if (string3 == null) {
            throw new IllegalArgumentException("UnitDepth.setConversionUnit():sourceUnit is null!");
        }
        if (string2 == null) {
            throw new IllegalArgumentException("UnitDepth.setConversionUnit():destinationUnit is null!");
        }
        ((a)object).e = 1.0;
        ((a)object).f = 0.0;
        string = ((a)object).a(string3);
        String string4 = ((a)object).a(string2);
        int n = 0;
        while (true) {
            if (n >= ((a)object).b.size()) {
                double d3 = d2;
                object = this;
                if (((a)object).c == null) return d3;
                if (((a)object).d == null) return d3;
                return d3 * ((a)object).e + ((a)object).f;
            }
            string2 = ((a)object).b.get(n);
            if (string2.a().a().equals(string) && string2.b().a().equals(string4)) {
                ((a)object).c = string2.a();
                ((a)object).d = string2.b();
                ((a)object).e = string2.c();
                ((a)object).f = 0.0;
            }
            ++n;
        }
    }

    public final void a() {
        int n;
        if (this.a != null) {
            for (n = 0; n < this.a.size(); ++n) {
                this.a.get(n).b();
            }
            this.a.clear();
            this.a = null;
        }
        if (this.b != null) {
            for (n = 0; n < this.b.size(); ++n) {
                this.b.get(n).d();
            }
            this.b.clear();
            this.b = null;
        }
        if (this.c != null) {
            this.c.b();
            this.c = null;
        }
        if (this.d == null) return;
        this.d.b();
        this.d = null;
    }
}

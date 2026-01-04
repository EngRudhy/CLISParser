/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.z
 *  a.b.f
 */
package Converter.Cifp;

import Converter.Cifp.z;
import a.b.f;

public final class y {
    private String a;
    private double b;
    private double c;
    private double d;
    private int e;
    private double[] f;

    public y() {
        z.a.toString();
        this.a = "";
        this.b = 0.0;
        this.c = 0.0;
        this.d = 0.0;
        this.e = 0;
        this.f = null;
    }

    public final String a() {
        return this.a;
    }

    public final void a(String string) throws IllegalArgumentException {
        if (string == null) {
            throw new IllegalArgumentException("SamplingDriver.setUnit(): unit is null");
        }
        this.a = string;
    }

    public final double b() {
        return this.b;
    }

    public final void a(double d) {
        this.b = d;
    }

    public final double c() {
        return this.c;
    }

    public final void b(double d) {
        this.c = d;
    }

    public final double d() {
        return this.d;
    }

    public final void c(double d) {
        this.d = d;
    }

    public final double[] e() throws NullPointerException {
        if (this.f != null) return this.f;
        throw new NullPointerException("SamplingDriver.getIndexValues(): index value array is null");
    }

    public final boolean f() {
        if (!(Math.abs(this.d) > 1.0E-5)) return false;
        return true;
    }

    public final boolean g() {
        if (this.f()) {
            if (!(this.d > 0.0)) return false;
            return true;
        }
        if (!(this.f[0] < this.f[this.f.length - 1])) return false;
        return true;
    }

    public final int h() {
        if (this.f()) {
            Math.abs(this.c);
            return (int)((this.c - this.b) / this.d + 0.5) + 1;
        }
        if (this.f == null) return 0;
        return this.f.length;
    }

    public y(z object, String string, double d, double d2, double d3) {
        z.a.toString();
        this.a = "";
        this.b = 0.0;
        this.c = 0.0;
        this.d = 0.0;
        this.e = 0;
        this.f = null;
        this.a = string.equalsIgnoreCase("m") ? "meter" : string;
        double d4 = d3;
        double d5 = d2;
        double d6 = d;
        object = this;
        this.d = d4;
        if (d4 > 0.0) {
            object.b = Math.min(d6, d5);
            object.c = Math.max(d6, d5);
            return;
        }
        if (d4 < 0.0) {
            object.b = Math.max(d6, d5);
            object.c = Math.min(d6, d5);
            return;
        }
        object.b = d6;
        object.c = d5;
    }

    public final void a(f object) {
        if (object == null) return;
        if (this.f == null) return;
        if (this.f.length <= 0) return;
        int n = 0;
        int n2 = this.f.length - 1;
        while (true) {
            if (object.a(this.f[n])) {
                ++n;
                continue;
            }
            if (!object.a(this.f[n2])) {
                object = new double[n2 - n + 1];
                System.arraycopy(this.f, n, object, 0, ((f)object).length);
                this.f = (double[])object;
                return;
            }
            --n2;
        }
    }

    public final void i() {
        this.a = null;
        this.f = null;
    }
}

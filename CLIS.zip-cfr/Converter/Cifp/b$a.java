/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.b
 */
package Converter.Cifp;

import Converter.Cifp.b;

final class b.a {
    public double a = -99999.0;
    public double b = 99999.0;

    public b.a(b b2, double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean a() {
        if (!(Math.abs(this.a - -99999.0) < 1.0E-6)) return false;
        return true;
    }

    public final boolean b() {
        if (!(Math.abs(this.b + -99999.0) < 1.0E-6)) return false;
        return true;
    }
}

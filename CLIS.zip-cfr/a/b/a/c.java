/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a.b.a.b
 */
package a.b.a;

import a.b.a.b;

public final class c {
    private b a;
    private b b;
    private double c;
    private double d;

    public c() {
        this.a = null;
        this.b = null;
        this.c = 1.0;
        this.d = 0.0;
    }

    public c(b b2, b b3, double d) {
        this.a = b2;
        this.b = b3;
        this.c = d;
        this.d = 0.0;
    }

    public final b a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    public final void d() {
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
        if (this.b == null) return;
        this.b.b();
        this.b = null;
    }
}

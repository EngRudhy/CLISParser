/*
 * Decompiled with CFR 0.152.
 */
package a.b;

public final class f {
    private double[] a = null;
    private float[] b = null;
    private int[] c = null;
    private short[] d = null;
    private byte[] e = null;
    private double[] f = null;

    public f() {
        this.b(-999.0);
        this.b(-999.25);
        this.b(-9999.0);
        this.b(-999.0f);
        this.b(-999.25f);
        this.b(-9999.0f);
        this.b(-32767.0f);
        this.b(-9999);
        this.b((short)-9999);
        this.b((short)-32767);
        this.b((byte)127);
        this.b((byte)-128);
        this.b((byte)-128);
        this.b(-99999.0);
        this.b(-99999.0f);
        this.b(-99999);
        this.b(-99999.0f);
        this.b((short)-32767);
    }

    public final void a(double[] dArray) {
        this.f = dArray;
    }

    public final boolean a(double d) {
        int n;
        if (Double.isNaN(d)) {
            return true;
        }
        if (this.f != null) {
            for (n = this.f.length - 1; n >= 0; --n) {
                if (!(Math.abs(d - this.f[n]) < 1.0E-6)) continue;
                return true;
            }
        }
        if (this.a == null) return false;
        n = this.a.length - 1;
        while (n >= 0) {
            if (d == this.a[n]) {
                return true;
            }
            --n;
        }
        return false;
    }

    public final boolean a(float f2) {
        int n;
        if (Float.isNaN(f2)) {
            return true;
        }
        if (this.f != null) {
            for (n = this.f.length - 1; n >= 0; --n) {
                if (!(Math.abs((double)f2 - this.f[n]) < 1.0E-6)) continue;
                return true;
            }
        }
        if (this.b == null) return false;
        n = this.b.length - 1;
        while (n >= 0) {
            if (f2 == this.b[n]) {
                return true;
            }
            --n;
        }
        return false;
    }

    public final boolean a(int n) {
        int n2;
        if (this.f != null) {
            for (n2 = this.f.length - 1; n2 >= 0; --n2) {
                if (!(Math.abs((double)n - this.f[n2]) < 1.0E-6)) continue;
                return true;
            }
        }
        if (this.c == null) return false;
        n2 = this.c.length - 1;
        while (n2 >= 0) {
            if (n == this.c[n2]) {
                return true;
            }
            --n2;
        }
        return false;
    }

    public final boolean a(short s) {
        int n;
        if (this.f != null) {
            for (n = this.f.length - 1; n >= 0; --n) {
                if (!(Math.abs((double)s - this.f[n]) < 1.0E-6)) continue;
                return true;
            }
        }
        if (this.d == null) return false;
        n = this.d.length - 1;
        while (n >= 0) {
            if (s == this.d[n]) {
                return true;
            }
            --n;
        }
        return false;
    }

    public final boolean a(byte by) {
        int n;
        if (this.f != null) {
            for (n = this.f.length - 1; n >= 0; --n) {
                if (!(Math.abs((double)by - this.f[n]) < 1.0E-6)) continue;
                return true;
            }
        }
        if (this.e == null) return false;
        n = this.e.length - 1;
        while (n >= 0) {
            if (by == this.e[n]) {
                return true;
            }
            --n;
        }
        return false;
    }

    private void b(double d) {
        if (this.a == null) {
            this.a = new double[1];
            this.a[0] = d;
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.a.length) {
                double[] dArray = new double[this.a.length + 1];
                System.arraycopy(this.a, 0, dArray, 0, this.a.length);
                dArray[this.a.length] = d;
                this.a = dArray;
                return;
            }
            if (this.a[n] == d) {
                return;
            }
            ++n;
        }
    }

    private void b(float f2) {
        if (this.b == null) {
            this.b = new float[1];
            this.b[0] = f2;
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.b.length) {
                float[] fArray = new float[this.b.length + 1];
                System.arraycopy(this.b, 0, fArray, 0, this.b.length);
                fArray[this.b.length] = f2;
                this.b = fArray;
                return;
            }
            if (this.b[n] == f2) {
                return;
            }
            ++n;
        }
    }

    private void b(int n) {
        if (this.c == null) {
            this.c = new int[1];
            this.c[0] = n;
            return;
        }
        int n2 = 0;
        while (true) {
            if (n2 >= this.c.length) {
                int[] nArray = new int[this.c.length + 1];
                System.arraycopy(this.c, 0, nArray, 0, this.c.length);
                nArray[this.c.length] = n;
                this.c = nArray;
                return;
            }
            if (this.c[n2] == n) {
                return;
            }
            ++n2;
        }
    }

    private void b(short s) {
        if (this.d == null) {
            this.d = new short[1];
            this.d[0] = s;
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.d.length) {
                short[] sArray = new short[this.d.length + 1];
                System.arraycopy(this.d, 0, sArray, 0, this.d.length);
                sArray[this.d.length] = s;
                this.d = sArray;
                return;
            }
            if (this.d[n] == s) {
                return;
            }
            ++n;
        }
    }

    private void b(byte by) {
        if (this.e == null) {
            this.e = new byte[1];
            this.e[0] = by;
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.e.length) {
                byte[] byArray = new byte[this.e.length + 1];
                System.arraycopy(this.e, 0, byArray, 0, this.e.length);
                byArray[this.e.length] = by;
                this.e = byArray;
                return;
            }
            if (this.e[n] == by) {
                return;
            }
            ++n;
        }
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}

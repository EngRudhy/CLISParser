/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  a.a.a.a
 *  a.a.a.b$1
 *  a.a.a.c
 *  a.a.a.e
 *  a.a.a.f
 *  a.b.a
 *  a.b.b
 *  a.b.g
 */
package a.a.a;

import a.a.a.a;
import a.a.a.b;
import a.a.a.c;
import a.a.a.e;
import a.a.a.f;
import a.b.g;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "";
    private int o = -999;
    private int p = -999;
    private int q = -999;
    private int r = -999;
    private int s = -999;
    private float t = 999.0f;
    private float u = -999.0f;
    private int v = 0;
    private int w = 0;
    private int x = 1;
    private int y = 0;
    private int z = -1;
    private int A = 0;
    private int B = 0;
    private long C = 0L;
    private int D = 0;
    private List<c> E = new ArrayList<c>();
    private double F = 0.0;
    private double G = 0.0;
    private double H = 0.0;
    private double I = 0.0;
    private a J = null;
    private DecimalFormat K = new DecimalFormat(".000");
    private int L = 0;
    private int M = 0;
    private float N = -999.0f;
    private float O = -999.0f;
    private float P = -999.0f;
    private int Q = -999;
    private float R = -999.0f;
    private float S = -999.0f;
    private float T = -999.0f;
    private int U = -999;
    private int V = -999;
    private int W = -1;

    public final int a() {
        return this.W;
    }

    public final void a(int n) {
        this.W = n;
    }

    public final int b() {
        return this.U;
    }

    public final int c() {
        return this.V;
    }

    public final float d() {
        return this.R;
    }

    public final float e() {
        return this.S;
    }

    public final float f() {
        return this.T;
    }

    public final int g() {
        return this.L;
    }

    public final int h() {
        return this.M;
    }

    public final float i() {
        return this.N;
    }

    public final float j() {
        return this.O;
    }

    public final float k() {
        return this.P;
    }

    public final int l() {
        return this.Q;
    }

    public final int m() {
        return this.o;
    }

    public final int n() {
        return this.p;
    }

    public final int o() {
        return this.q;
    }

    public final int p() {
        return this.r;
    }

    public final int q() {
        return this.s;
    }

    public final float r() {
        return this.t;
    }

    public final float s() {
        return this.u;
    }

    public b(a a2) {
        this.J = a2;
    }

    public final String t() {
        return this.h;
    }

    public final int u() {
        return this.y;
    }

    public final int v() {
        return this.x;
    }

    public final double w() {
        return this.H;
    }

    public final String x() {
        return this.i;
    }

    public final String y() {
        return this.a;
    }

    public final String z() {
        return this.g;
    }

    public final String A() {
        return this.e;
    }

    public final double B() {
        return this.I;
    }

    public final double C() {
        return this.F;
    }

    public final String D() {
        return this.b;
    }

    public final String E() {
        return this.f;
    }

    public final int F() {
        return this.w;
    }

    public final int G() {
        return this.v;
    }

    public final boolean a(g g2, RandomAccessFile randomAccessFile) throws IOException {
        boolean bl;
        double d2;
        if (this.J == null) {
            return false;
        }
        byte[] byArray = new byte[4096];
        randomAccessFile.read(byArray, 0, byArray.length);
        this.a = new String(byArray, 0, 14);
        this.a = Converter.Cifp.a.d((String)this.a).trim();
        this.c = new String(byArray, 14, 2);
        this.c = Converter.Cifp.a.d((String)this.c).trim();
        if (!this.c.equalsIgnoreCase("A")) {
            return false;
        }
        this.d = new String(byArray, 16, 8);
        this.d = Converter.Cifp.a.d((String)this.d).trim();
        this.e = new String(byArray, 24, 8);
        this.e = Converter.Cifp.a.d((String)this.e).trim();
        this.f = new String(byArray, 32, 10);
        this.f = Converter.Cifp.a.d((String)this.f).trim();
        this.g = new String(byArray, 42, 20);
        this.g = Converter.Cifp.a.d((String)this.g).trim();
        this.h = new String(byArray, 62, 272);
        this.h = this.h.trim();
        this.i = new String(byArray, 334, 40);
        this.i = Converter.Cifp.a.d((String)this.i).trim();
        this.j = new String(byArray, 374, 8);
        this.j = Converter.Cifp.a.d((String)this.j).trim();
        this.k = new String(byArray, 382, 20);
        this.k = Converter.Cifp.a.d((String)this.k).trim();
        this.l = new String(byArray, 402, 12);
        this.l = Converter.Cifp.a.d((String)this.l).trim();
        this.b = new String(byArray, 414, 22);
        this.b = Converter.Cifp.a.d((String)this.b).trim();
        this.m = new String(byArray, 436, 20);
        this.m = Converter.Cifp.a.d((String)this.m).trim();
        this.n = new String(byArray, 456, 12);
        this.n = Converter.Cifp.a.d((String)this.n).trim();
        int n = a.a.a.f.c((g)g2, (byte[])byArray, (int)516);
        b b2 = this;
        this.o = n;
        n = a.a.a.f.c((g)g2, (byte[])byArray, (int)520);
        b2 = this;
        this.p = n;
        n = a.a.a.f.c((g)g2, (byte[])byArray, (int)524);
        b2 = this;
        this.q = n;
        n = a.a.a.f.c((g)g2, (byte[])byArray, (int)528);
        b2 = this;
        this.r = n;
        n = a.a.a.f.c((g)g2, (byte[])byArray, (int)532);
        b2 = this;
        this.s = n;
        this.v = a.a.a.f.c((g)g2, (byte[])byArray, (int)536);
        float f2 = a.a.a.f.a((g)g2, (byte[])byArray, (int)540);
        b2 = this;
        this.t = f2;
        f2 = a.a.a.f.a((g)g2, (byte[])byArray, (int)544);
        b2 = this;
        this.u = f2;
        int n2 = a.a.a.f.c((g)g2, (byte[])byArray, (int)552);
        b2 = this;
        this.L = n2;
        n2 = a.a.a.f.c((g)g2, (byte[])byArray, (int)556);
        b2 = this;
        this.M = n2;
        float f3 = a.a.a.f.a((g)g2, (byte[])byArray, (int)560);
        b2 = this;
        this.N = f3;
        f3 = a.a.a.f.a((g)g2, (byte[])byArray, (int)564);
        b2 = this;
        this.O = f3;
        f3 = a.a.a.f.a((g)g2, (byte[])byArray, (int)568);
        b2 = this;
        this.P = f3;
        int n3 = a.a.a.f.c((g)g2, (byte[])byArray, (int)572);
        b2 = this;
        this.Q = n3;
        this.w = a.a.a.f.c((g)g2, (byte[])byArray, (int)576);
        float f4 = a.a.a.f.a((g)g2, (byte[])byArray, (int)580);
        b2 = this;
        this.R = f4;
        f4 = a.a.a.f.a((g)g2, (byte[])byArray, (int)584);
        b2 = this;
        this.S = f4;
        f4 = a.a.a.f.a((g)g2, (byte[])byArray, (int)588);
        b2 = this;
        this.T = f4;
        int n4 = a.a.a.f.c((g)g2, (byte[])byArray, (int)592);
        b2 = this;
        this.U = n4;
        n4 = a.a.a.f.c((g)g2, (byte[])byArray, (int)596);
        b2 = this;
        this.V = n4;
        this.I = a.a.a.f.b((g)g2, (byte[])byArray, (int)600);
        a.a.a.f.b((g)g2, (byte[])byArray, (int)608);
        a.a.a.f.b((g)g2, (byte[])byArray, (int)616);
        this.x = a.a.a.f.c((g)g2, (byte[])byArray, (int)648);
        this.y = a.a.a.f.c((g)g2, (byte[])byArray, (int)652);
        this.A = a.a.a.f.c((g)g2, (byte[])byArray, (int)656);
        this.z = a.a.a.f.c((g)g2, (byte[])byArray, (int)664);
        int n5 = 0;
        n4 = 0;
        this.G = this.F = this.J.a.t();
        this.H = Double.parseDouble(this.K.format(this.J.a.k()));
        if (a.a.a.f.c((int)this.y) == 1) {
            double d3;
            n5 = a.a.a.f.c((g)g2, (byte[])byArray, (int)704);
            n4 = a.a.a.f.c((g)g2, (byte[])byArray, (int)708);
            d2 = a.a.a.f.b((g)g2, (byte[])byArray, (int)720);
            if (Math.abs(d2 - (d3 = a.a.a.f.b((g)g2, (byte[])byArray, (int)712))) < 1.0E7) {
                this.F = d2;
                this.H = d3;
            }
        } else if (a.a.a.f.c((int)this.y) == 2) {
            double d4;
            n5 = a.a.a.f.c((g)g2, (byte[])byArray, (int)732);
            n4 = a.a.a.f.c((g)g2, (byte[])byArray, (int)736);
            d2 = a.a.a.f.b((g)g2, (byte[])byArray, (int)748);
            if (Math.abs(d2 - (d4 = a.a.a.f.b((g)g2, (byte[])byArray, (int)740))) < 1.0E7) {
                this.F = d2;
                this.H = d4;
            }
        }
        this.B = n4 - n5 + 1;
        this.C = (int)((this.H - this.F) / this.I + 1.5);
        int n6 = (int)a.a.a.f.a((int)this.y);
        this.D = n6 > 0 ? (int)((double)(this.C * (long)this.x * (long)n6 / 4096L) + 1.5) : (int)((double)((float)(this.C * (long)this.x) * a.a.a.f.a((int)this.y) / 4096.0f) + 1.5);
        b b3 = this;
        if (b3.z == 1) {
            bl = true;
        } else {
            if (b3.z != 0) throw new IllegalArgumentException("CurveHeader:hasIndexBlock(): indexBlockFlag is invalid");
            bl = false;
        }
        this.a(g2, randomAccessFile, byArray, bl, a.a.a.f.c((int)this.y));
        if (this.E.isEmpty()) {
            return false;
        }
        if (this.E.size() <= 1) return true;
        if (this.E.get((int)(this.E.size() - 1)).a > 0) {
            if (this.E.get((int)(this.E.size() - 1)).a % 4096 == 0) return true;
        }
        this.E.get((int)(this.E.size() - 1)).a = this.E.get((int)(this.E.size() - 2)).a;
        return true;
    }

    private boolean a(g g2, RandomAccessFile randomAccessFile, byte[] byArray, int n, boolean bl) throws IOException {
        int n2 = a.a.a.f.c((g)g2, (byte[])byArray, (int)704);
        if (n == 2) {
            n2 = a.a.a.f.c((g)g2, (byte[])byArray, (int)732);
        }
        int n3 = this.B;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        boolean bl2 = true;
        int n7 = 0;
        while (n7 < n3) {
            int n8;
            if (n == 1) {
                n8 = a.a.a.f.c((g)g2, (byte[])byArray, (int)(728 + 4 * n7)) - 1 << 2;
            } else {
                if (n != 2) throw new IllegalArgumentException("CurveHeader.calculateDataBlockPosition():data block type is invalid");
                n8 = a.a.a.f.c((g)g2, (byte[])byArray, (int)(756 + 4 * n7)) - 1 << 2;
            }
            if (n7 == 0) {
                n5 = (int)(this.F / this.I + 0.5);
                n6 = (n5 = (n5 - this.A) * this.x * (int)a.a.a.f.a((int)this.y)) % 4096;
                if (n6 < 0) {
                    n6 += 4096;
                }
                if ((n5 /= 4096) < 0) {
                    --n5;
                }
                n5 -= n2 << 10;
            }
            randomAccessFile.seek(n8);
            byte[] byArray2 = new byte[4096];
            randomAccessFile.read(byArray2, 0, byArray2.length);
            if (this.B == 1 || this.B << 10 < Math.abs(n5)) {
                n5 %= 1024;
            }
            if (n5 < 0) {
                n5 += 1024;
            }
            if (n4 != -1) {
                n5 = 0;
            }
            for (int i = 0; i < 1024 - n5; ++i) {
                if (++n4 < this.D) {
                    int n9 = i + n5 < 0 ? -1 : a.a.a.f.c((g)g2, (byte[])byArray2, (int)(i + n5 << 2)) - 1 << 2;
                    if (n4 == 0 && n9 <= 0) {
                        n4 = -1;
                        bl2 = false;
                        break;
                    }
                    if (n9 < 0 && !bl) {
                        bl2 = false;
                    }
                    if (n4 == 0) {
                        this.E.add(new c(n9, n6));
                        if (!((float)(this.C * (long)this.x) * a.a.a.f.a((int)this.y) % 4096.0f > (float)(4096 - n6))) continue;
                        ++this.D;
                        continue;
                    }
                    this.E.add(new c(n9, 0));
                    continue;
                }
                i = 1024 - n5;
                n7 = this.B;
                this.B = n4;
            }
            if (n5 >= 1024) {
                n5 -= 1024;
            }
            ++n7;
        }
        return bl2;
    }

    private void a(g g2, RandomAccessFile randomAccessFile, byte[] byArray, boolean n, int n2) throws IOException {
        if (n != 0) {
            n = this.B;
            int n3 = this.D;
            if (this.a(g2, randomAccessFile, byArray, n2, false)) return;
            this.B = n;
            this.D = n3;
            this.E.clear();
            if (this.a(g2, randomAccessFile, byArray, n2, false)) return;
            this.B = n;
            this.D = n3;
            this.E.clear();
            this.a(g2, randomAccessFile, byArray, n2, true);
            return;
        }
        n = 0;
        while (n < this.B) {
            int n4;
            int n5 = 0;
            if (n == 0) {
                n5 = (int)(this.F / this.I + 0.5);
                n5 = (int)((float)((n5 - this.A) * this.x) * a.a.a.f.a((int)this.y));
                if ((n5 %= 4096) < 0) {
                    n5 += 4096;
                }
                if ((int)((float)(this.C * (long)this.x) * a.a.a.f.a((int)this.y)) % 4096 > 4096 - n5) {
                    ++this.D;
                }
            }
            if (n2 == 1) {
                n4 = this.D == this.B ? a.a.a.f.c((g)g2, (byte[])byArray, (int)(728 + 4 * n)) - 1 << 2 : a.a.a.f.c((g)g2, (byte[])byArray, (int)(732 + 4 * n)) - 1 << 2;
            } else {
                if (n2 != 2) throw new IllegalArgumentException("CurveHeader.calculateDataBlockPosition():data block type is invalid");
                n4 = a.a.a.f.c((g)g2, (byte[])byArray, (int)(756 + 4 * n)) - 1 << 2;
            }
            this.E.add(new c(n4, n5));
            ++n;
        }
    }

    public final Object a(int n, int n2) throws IOException {
        if (this.x > 1) {
            return null;
        }
        int n3 = n2;
        if ((this.y == 67109761 || this.y == 67109762) && n2 % 4 != 0) {
            n3 = n2 + (4 - n2 % 4);
        }
        byte[] byArray = new byte[Converter.Cifp.a.a((int)this.y, (int)((int)this.C), (int)this.x, (int)n, (int)n3)];
        Object object = a.b.a.a((a.b.b)a.a.a.f.b((int)this.y), (int)n2);
        e e2 = new e();
        this.a(byArray, n, n2, e2);
        boolean bl = false;
        if (n == 0) {
            bl = true;
        }
        a.a.a.f.a((g)this.J.d(), (byte[])byArray, (int)this.y, (Object)object, (int)n2, (int)e2.a, (boolean)bl, (int)((int)(this.C * (long)this.x)));
        return object;
    }

    public final Object a(int n, int n2, int n3, int n4) throws IOException {
        if (this.x <= 1) {
            return null;
        }
        byte[] byArray = new byte[Converter.Cifp.a.a((int)this.y, (int)((int)this.C), (int)this.x, (int)n, (int)n2)];
        Object object = a.b.a.a((a.b.b)a.a.a.f.b((int)this.y), (int)n2, (int)n4);
        e e2 = new e();
        this.a(byArray, n, n2, e2);
        int cfr_ignored_0 = e2.a;
        a.a.a.f.a((g)this.J.d(), (byte[])byArray, (int)this.y, (Object)object, (int)n3, (int)n4, (int)((int)this.C), (int)this.x);
        return object;
    }

    private void a(byte[] byArray, int n, int n2, e e2) throws IOException {
        int n3;
        e e3 = new e();
        e e4 = new e();
        e e5 = new e();
        e e6 = e2;
        e e7 = e5;
        e e8 = e4;
        e e9 = e3;
        int n4 = n2;
        n2 = n;
        Object object = this;
        int n5 = 0;
        int n6 = Converter.Cifp.a.a((int)((b)object).y, (int)((int)((b)object).C), (int)((b)object).x, (int)0, (int)n2);
        for (n3 = 0; n3 < ((b)object).E.size(); ++n3) {
            c c2 = ((b)object).E.get(n3);
            if (n6 > (n5 += 4096 - c2.b)) continue;
            e9.a = n3;
            e7.a = 4096 - (n5 - (int)((double)((float)n2 * a.a.a.f.a((int)((b)object).y) * (float)((b)object).x) + 0.5));
            n3 = n2;
            n6 = ((b)object).x;
            n5 = (int)((b)object).C;
            int n7 = ((b)object).y;
            n5 *= n6;
            n6 = 0;
            if (n7 == 67109826 || n7 == 67109825) {
                if (n5 % 2 == 0 && n3 % 2 == 0 || n5 % 2 == 1 && n3 % 2 == 1) {
                    n6 = 0;
                } else if (n5 % 2 == 0 && n3 % 2 == 1 || n5 % 2 == 1 && n3 % 2 == 0) {
                    n6 = 1;
                }
            } else if (n7 == 0x4000402 || n7 == 0x4000401) {
                if (n5 % 4 == 0 && n3 % 4 == 0 || n5 % 4 == 1 && n3 % 4 == 1 || n5 % 4 == 2 && n3 % 4 == 2 || n5 % 4 == 3 && n3 % 4 == 3) {
                    n6 = 0;
                } else if (n5 % 4 == 0 && n3 % 4 == 1 || n5 % 4 == 1 && n3 % 4 == 2 || n5 % 4 == 2 && n3 % 4 == 3 || n5 % 4 == 3 && n3 % 4 == 0) {
                    n6 = 1;
                } else if (n5 % 4 == 0 && n3 % 4 == 2 || n5 % 4 == 1 && n3 % 4 == 3 || n5 % 4 == 2 && n3 % 4 == 0 || n5 % 4 == 3 && n3 % 4 == 1) {
                    n6 = 2;
                } else if (n5 % 4 == 0 && n3 % 4 == 3 || n5 % 4 == 1 && n3 % 4 == 0 || n5 % 4 == 2 && n3 % 4 == 1 || n5 % 4 == 3 && n3 % 4 == 2) {
                    n6 = 3;
                }
            } else if (n7 == 0x4000442 || n7 == 0x4000441) {
                if (n5 % 8 == 0 && n3 % 8 == 0 || n5 % 8 == 1 && n3 % 8 == 1 || n5 % 8 == 2 && n3 % 8 == 2 || n5 % 8 == 3 && n3 % 8 == 3 || n5 % 8 == 4 && n3 % 8 == 4 || n5 % 8 == 5 && n3 % 8 == 5 || n5 % 8 == 6 && n3 % 8 == 6 || n5 % 8 == 7 && n3 % 8 == 7) {
                    n6 = 0;
                } else if (n5 % 8 == 0 && n3 % 8 == 1 || n5 % 8 == 1 && n3 % 8 == 2 || n5 % 8 == 2 && n3 % 8 == 3 || n5 % 8 == 3 && n3 % 8 == 4 || n5 % 8 == 4 && n3 % 8 == 5 || n5 % 8 == 5 && n3 % 8 == 6 || n5 % 8 == 6 && n3 % 8 == 7 || n5 % 8 == 7 && n3 % 8 == 0) {
                    n6 = 1;
                } else if (n5 % 8 == 0 && n3 % 8 == 2 || n5 % 8 == 1 && n3 % 8 == 3 || n5 % 8 == 2 && n3 % 8 == 4 || n5 % 8 == 3 && n3 % 8 == 5 || n5 % 8 == 4 && n3 % 8 == 6 || n5 % 8 == 5 && n3 % 8 == 7 || n5 % 8 == 6 && n3 % 8 == 0 || n5 % 8 == 7 && n3 % 8 == 1) {
                    n6 = 2;
                } else if (n5 % 8 == 0 && n3 % 8 == 3 || n5 % 8 == 1 && n3 % 8 == 4 || n5 % 8 == 2 && n3 % 8 == 5 || n5 % 8 == 3 && n3 % 8 == 6 || n5 % 8 == 4 && n3 % 8 == 7 || n5 % 8 == 5 && n3 % 8 == 0 || n5 % 8 == 6 && n3 % 8 == 1 || n5 % 8 == 7 && n3 % 8 == 2) {
                    n6 = 3;
                } else if (n5 % 8 == 0 && n3 % 8 == 4 || n5 % 8 == 1 && n3 % 8 == 5 || n5 % 8 == 2 && n3 % 8 == 6 || n5 % 8 == 3 && n3 % 8 == 7 || n5 % 8 == 4 && n3 % 8 == 0 || n5 % 8 == 5 && n3 % 8 == 1 || n5 % 8 == 6 && n3 % 8 == 2 || n5 % 8 == 7 && n3 % 8 == 3) {
                    n6 = 4;
                } else if (n5 % 8 == 0 && n3 % 8 == 5 || n5 % 8 == 1 && n3 % 8 == 6 || n5 % 8 == 2 && n3 % 8 == 7 || n5 % 8 == 3 && n3 % 8 == 0 || n5 % 8 == 4 && n3 % 8 == 1 || n5 % 8 == 5 && n3 % 8 == 2 || n5 % 8 == 6 && n3 % 8 == 3 || n5 % 8 == 7 && n3 % 8 == 4) {
                    n6 = 5;
                } else if (n5 % 8 == 0 && n3 % 8 == 6 || n5 % 8 == 1 && n3 % 8 == 7 || n5 % 8 == 2 && n3 % 8 == 0 || n5 % 8 == 3 && n3 % 8 == 1 || n5 % 8 == 4 && n3 % 8 == 2 || n5 % 8 == 5 && n3 % 8 == 3 || n5 % 8 == 6 && n3 % 8 == 4 || n5 % 8 == 7 && n3 % 8 == 5) {
                    n6 = 6;
                } else if (n5 % 8 == 0 && n3 % 8 == 7 || n5 % 8 == 1 && n3 % 8 == 0 || n5 % 8 == 2 && n3 % 8 == 1 || n5 % 8 == 3 && n3 % 8 == 2 || n5 % 8 == 4 && n3 % 8 == 3 || n5 % 8 == 5 && n3 % 8 == 4 || n5 % 8 == 6 && n3 % 8 == 5 || n5 % 8 == 7 && n3 % 8 == 6) {
                    n6 = 7;
                }
            } else {
                n6 = 0;
            }
            e6.a = n6;
            break;
        }
        n3 = Converter.Cifp.a.a((int)((b)object).y, (int)((int)((b)object).C), (int)((b)object).x, (int)n2, (int)n4);
        int n8 = n3 / 4096;
        n5 = n3 % 4096;
        n8 = n5 > 4096 - e7.a ? (n8 += 2) : ++n8;
        e8.a = e9.a + n8 - 1;
        object = this.J.c();
        if (object == null) {
            throw new IllegalArgumentException("CurveHeader.readSamples():file stream is null");
        }
        if (e4.a > this.E.size()) {
            a.b.b b2 = a.a.a.f.b((int)this.y);
            Object object2 = a.b.a.a((a.b.b)b2, (int)1);
            switch (1.a[b2.ordinal()]) {
                case 1: {
                    ((byte[])object2)[0] = 127;
                    break;
                }
                case 2: {
                    ((short[])object2)[0] = -9999;
                    break;
                }
                case 3: {
                    ((int[])object2)[0] = -9999;
                    break;
                }
                case 4: {
                    ((long[])object2)[0] = -9999L;
                    break;
                }
                case 5: {
                    ((float[])object2)[0] = -9999.0f;
                    break;
                }
                case 6: {
                    ((double[])object2)[0] = -9999.0;
                    break;
                }
            }
            int n9 = 0;
            while (n9 < byArray.length) {
                a.a.a.f.a((g)this.J.d(), (int)this.y, (Object)object2, (int)0, (int)1, (byte[])byArray, (int)n9);
                n9 = (int)((float)n9 + a.a.a.f.a((int)this.y));
            }
            return;
        }
        n2 = 0;
        n4 = e3.a;
        while (n4 <= e4.a) {
            if (byArray.length <= 4096 - e5.a && this.E.get((int)n4).a > 0) {
                ((RandomAccessFile)object).seek(this.E.get((int)n4).a + e5.a);
                ((RandomAccessFile)object).read(byArray, 0, byArray.length);
                return;
            }
            if (n4 == e3.a && this.E.get((int)n4).a > 0) {
                ((RandomAccessFile)object).seek(this.E.get((int)n4).a + e5.a);
                ((RandomAccessFile)object).read(byArray, n2, 4096 - e5.a);
                n2 += 4096 - e5.a;
            } else if (n4 == e4.a && this.E.get((int)n4).a > 0) {
                ((RandomAccessFile)object).seek(this.E.get((int)n4).a + this.E.get((int)n4).b);
                int n10 = 4096 - e5.a + 4096 * (e4.a - e3.a - 1);
                n10 = byArray.length - n10;
                ((RandomAccessFile)object).read(byArray, n2, n10);
            } else if (this.E.get((int)n4).a > 0) {
                ((RandomAccessFile)object).seek(this.E.get((int)n4).a + this.E.get((int)n4).b);
                ((RandomAccessFile)object).read(byArray, n2, 4096);
                n2 += 4096;
            }
            ++n4;
        }
    }

    public final void H() {
        if (this.E != null) {
            this.E.clear();
            this.E = null;
        }
        this.J = null;
        this.K = null;
    }
}

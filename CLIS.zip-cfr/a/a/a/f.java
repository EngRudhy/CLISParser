/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  a.a.a.f$1
 *  a.a.a.g
 *  a.b.b
 *  a.b.g
 */
package a.a.a;

import Converter.Cifp.a;
import a.a.a.f;
import a.a.a.g;
import a.b.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f {
    private static List<g> a = new ArrayList<g>();

    public static float a(int n) {
        g g2;
        Iterator<g> iterator = a.iterator();
        do {
            if (!iterator.hasNext()) return 0.0f;
        } while (n != (g2 = iterator.next()).a());
        return g2.b();
    }

    public static b b(int n) {
        g g2;
        Iterator<g> iterator = a.iterator();
        do {
            if (!iterator.hasNext()) return b.f;
        } while (n != (g2 = iterator.next()).a());
        return g2.c();
    }

    public static int c(int n) {
        g g2;
        Iterator<g> iterator = a.iterator();
        do {
            if (!iterator.hasNext()) return 0;
        } while (n != (g2 = iterator.next()).a());
        return g2.d();
    }

    public static float a(a.b.g object, byte[] byArray, int n) {
        float f2 = 0.0f;
        byte[] byArray2 = new byte[4];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = byArray2;
                f2 = Float.intBitsToFloat(Converter.Cifp.a.a((byte[])byArray2));
                break;
            }
            case 3: {
                Converter.Cifp.a.f((byte[])byArray2);
                object = byArray2;
                f2 = Float.intBitsToFloat(Converter.Cifp.a.a((byte[])byArray2));
                break;
            }
        }
        return f2;
    }

    public static double b(a.b.g object, byte[] byArray, int n) {
        double d = 0.0;
        byte[] byArray2 = new byte[8];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                d = Converter.Cifp.a.d((byte[])byArray2);
                break;
            }
            case 3: {
                object = byArray2;
                Object object2 = byArray2[0];
                object[0] = object[7];
                object[7] = (a.b.g)object2;
                object2 = object[1];
                object[1] = object[6];
                object[6] = (a.b.g)object2;
                object2 = object[2];
                object[2] = object[5];
                object[5] = (a.b.g)object2;
                object2 = object[3];
                object[3] = object[4];
                object[4] = (a.b.g)object2;
                d = Converter.Cifp.a.d((byte[])byArray2);
                break;
            }
        }
        return d;
    }

    public static int c(a.b.g g2, byte[] byArray, int n) {
        int n2 = 0;
        byte[] byArray2 = new byte[4];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[g2.ordinal()]) {
            case 1: 
            case 2: {
                n2 = Converter.Cifp.a.a((byte[])byArray2);
                break;
            }
            case 3: {
                Converter.Cifp.a.f((byte[])byArray2);
                n2 = Converter.Cifp.a.a((byte[])byArray2);
                break;
            }
        }
        return n2;
    }

    private static short d(a.b.g g2, byte[] byArray, int n) {
        short s = 0;
        byte[] byArray2 = new byte[2];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[g2.ordinal()]) {
            case 1: 
            case 2: {
                s = Converter.Cifp.a.b((byte[])byArray2);
                break;
            }
            case 3: {
                Converter.Cifp.a.e((byte[])byArray2);
                s = Converter.Cifp.a.b((byte[])byArray2);
                break;
            }
        }
        return s;
    }

    private static int e(a.b.g g2, byte[] byArray, int n) {
        int n2 = 0;
        byte[] byArray2 = new byte[2];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[g2.ordinal()]) {
            case 1: 
            case 2: {
                n2 = Converter.Cifp.a.c((byte[])byArray2);
                break;
            }
            case 3: {
                Converter.Cifp.a.e((byte[])byArray2);
                n2 = Converter.Cifp.a.c((byte[])byArray2);
                break;
            }
        }
        return n2;
    }

    private static short f(a.b.g g2, byte[] byArray, int n) {
        short s = 0;
        byte[] byArray2 = new byte[1];
        System.arraycopy(byArray, n, byArray2, 0, byArray2.length);
        switch (1.a[g2.ordinal()]) {
            case 1: 
            case 2: {
                s = (short)(byArray[n] & 0xFF);
                break;
            }
            case 3: {
                s = (short)(byArray[n] & 0xFF);
                break;
            }
        }
        return s;
    }

    /*
     * Unable to fully structure code
     */
    public static void a(a.b.g var0, byte[] var1_1, int var2_2, Object var3_3, int var4_4, int var5_5, boolean var6_6, int var7_7) {
        if (!var3_3.getClass().isArray()) {
            throw new IllegalArgumentException("RepCodeConvertor.decode():data is not array");
        }
        switch (var2_2) {
            case 0x4000001: 
            case 0x4000002: {
                var2_2 = var1_1.length / 4;
                var8_8 = 0;
                while (var8_8 < var2_2) {
                    ((float[])var3_3)[var8_8] = f.a(var0, var1_1, var8_8 << 2);
                    ++var8_8;
                }
                return;
            }
            case 0x4000041: 
            case 0x4000042: {
                var2_2 = var1_1.length / 8;
                var8_9 = 0;
                while (var8_9 < var2_2) {
                    ((double[])var3_3)[var8_9] = f.b(var0, var1_1, var8_9 << 3);
                    ++var8_9;
                }
                return;
            }
            case 67109249: 
            case 67109250: {
                var2_2 = var1_1.length / 4;
                var8_10 = 0;
                while (var8_10 < var2_2) {
                    ((int[])var3_3)[var8_10] = f.c(var0, var1_1, var8_10 << 2);
                    ++var8_10;
                }
                return;
            }
            case 67109313: 
            case 67109314: {
                var2_2 = var1_1.length / 2;
                var8_11 = 0;
                while (var8_11 < var2_2) {
                    ((short[])var3_3)[var8_11] = f.d(var0, var1_1, var8_11 << 1);
                    ++var8_11;
                }
                return;
            }
            case 67109377: 
            case 0x4000202: {
                var2_2 = var1_1.length;
                var8_12 = 0;
                while (var8_12 < var2_2) {
                    ((byte[])var3_3)[var8_12] = var1_1[var8_12];
                    ++var8_12;
                }
                return;
            }
            case 67109697: 
            case 67109698: {
                var2_2 = 0;
                var8_13 = var1_1.length / 2;
                var5_5 = 0;
                while (var5_5 < var8_13) {
                    var4_4 = f.e(var0, var1_1, var5_5 << 1);
                    if (var2_2 == 0 && var4_4 == 0) {
                        ((int[])var3_3)[var5_5] = var4_4;
                    } else {
                        v0 = var2_2 = var2_2 <= 0 ? 1 : -1;
                        if (var5_5 + var2_2 < var8_13) {
                            ((int[])var3_3)[var5_5 + var2_2] = var4_4;
                        }
                    }
                    ++var5_5;
                }
                return;
            }
            case 67109761: 
            case 67109762: {
                var2_2 = 0;
                var8_14 = var1_1.length;
                var5_5 = 0;
                while (var5_5 < var4_4) {
                    var2_2 = 3 - 2 * (var5_5 % 4);
                    ((short[])var3_3)[var5_5] = var5_5 + var2_2 > var8_14 - 1 ? f.f(var0, var1_1, var5_5) : f.f(var0, var1_1, var5_5 + var2_2);
                    ++var5_5;
                }
                return;
            }
            case 67109825: 
            case 67109826: {
                var2_2 = 0;
                var8_15 = 0;
                if (!var6_6) ** GOTO lbl82
                if (var7_7 % 2 == 0) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] & 15);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 4 & 15);
                    var2_2 += 2;
                } else {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 4 & 15);
                    ++var2_2;
                }
                while (true) {
                    ++var8_15;
lbl82:
                    // 2 sources

                    do {
                        if (var2_2 > var4_4) return;
                        ((byte[])var3_3)[var2_2] = (byte)(var1_1[var8_15] >> 4 * (1 - var5_5) & 15);
                        ++var2_2;
                    } while ((var5_5 %= 2) % 2 != 0);
                }
            }
            case 0x4000401: 
            case 0x4000402: {
                var2_2 = 0;
                var8_16 = 0;
                if (!var6_6) ** GOTO lbl114
                if (var7_7 % 4 == 0) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] & 3);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 2 & 3);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 4 & 3);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 6 & 3);
                    var8_16 += 4;
                } else if (var7_7 % 4 == 3) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 2 & 3);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 4 & 3);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 6 & 3);
                    var8_16 += 3;
                } else if (var7_7 % 4 == 2) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 4 & 3);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 6 & 3);
                    var8_16 += 2;
                } else {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 6 & 3);
                    ++var8_16;
                }
                while (true) {
                    ++var2_2;
lbl114:
                    // 2 sources

                    do {
                        if (var8_16 > var4_4) return;
                        ((byte[])var3_3)[var8_16] = (byte)(var1_1[var2_2] >> 2 * (3 - var5_5) & 3);
                        ++var8_16;
                    } while ((var5_5 %= 4) % 4 != 0);
                }
            }
            case 0x4000441: 
            case 0x4000442: {
                var2_2 = 0;
                var8_17 = 0;
                if (!var6_6) ** GOTO lbl184
                if (var5_5 % 8 == 0) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 1 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 2 & 1);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 3 & 1);
                    ((byte[])var3_3)[4] = (byte)(var1_1[0] >> 4 & 1);
                    ((byte[])var3_3)[5] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[6] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[7] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 8;
                } else if (var5_5 % 8 == 7) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 1 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 2 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 3 & 1);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 4 & 1);
                    ((byte[])var3_3)[4] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[5] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[6] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 7;
                } else if (var5_5 % 8 == 6) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 2 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 3 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 4 & 1);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[4] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[5] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 6;
                } else if (var5_5 % 8 == 5) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 3 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 4 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[4] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 5;
                } else if (var5_5 % 4 == 4) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 4 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[3] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 4;
                } else if (var5_5 % 8 == 3) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 5 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[2] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 3;
                } else if (var5_5 % 8 == 2) {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 6 & 1);
                    ((byte[])var3_3)[1] = (byte)(var1_1[0] >> 7 & 1);
                    var2_2 += 2;
                } else {
                    ((byte[])var3_3)[0] = (byte)(var1_1[0] >> 7 & 1);
                    ++var2_2;
                }
                while (true) {
                    ++var8_17;
lbl184:
                    // 2 sources

                    do {
                        if (var2_2 > var4_4) return;
                        ((byte[])var3_3)[var2_2] = (byte)(var1_1[var8_17] >> 1 * (7 - var5_5) & 1);
                        ++var2_2;
                    } while ((var5_5 %= 8) % 8 != 0);
                }
            }
            case 67110017: 
            case 67110018: {
                var2_2 = var1_1.length;
                var8_18 = 0;
                while (var8_18 < var2_2) {
                    ((short[])var3_3)[var8_18] = f.f(var0, var1_1, var8_18);
                    ++var8_18;
                }
                return;
            }
        }
    }

    public static void a(a.b.g g2, byte[] byArray, int n, Object object, int n2, int n3, int n4, int n5) {
        if (!Array.get(object, 0).getClass().isArray()) {
            throw new IllegalArgumentException("RepCodeConvertor.decode():data array is not 2 dimenison array");
        }
        switch (n) {
            case 0x4000001: 
            case 0x4000002: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((float[][])object)[n][n4] = f.a(g2, byArray, n2 + (n4 << 2));
                    }
                    n2 += n5 << 2;
                    ++n;
                }
                return;
            }
            case 0x4000041: 
            case 0x4000042: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((double[][])object)[n][n4] = f.b(g2, byArray, n2 + (n4 << 3));
                    }
                    n2 += n5 << 3;
                    ++n;
                }
                return;
            }
            case 67109249: 
            case 67109250: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((int[][])object)[n][n4] = f.c(g2, byArray, n2 + (n4 << 2));
                    }
                    n2 += n5 << 2;
                    ++n;
                }
                return;
            }
            case 67109313: 
            case 67109314: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((short[][])object)[n][n4] = f.d(g2, byArray, n2 + (n4 << 1));
                    }
                    n2 += n5 << 1;
                    ++n;
                }
                return;
            }
            case 67109377: 
            case 0x4000202: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((byte[][])object)[n][n4] = byArray[n2 + n4];
                    }
                    n2 += n5;
                    ++n;
                }
                return;
            }
            case 67109697: 
            case 67109698: {
                n = 0;
                n4 = 0;
                while (n4 < Array.getLength(object)) {
                    for (int i = 0; i < n3; ++i) {
                        n = n <= 0 ? 2 : -2;
                        ((int[][])object)[n4][i] = f.e(g2, byArray, n2 + (i << 1) + n);
                    }
                    n2 += n5 << 1;
                    ++n4;
                }
                return;
            }
            case 67109761: 
            case 67109762: {
                n = 0;
                n4 = 0;
                while (n4 < Array.getLength(object)) {
                    for (int i = 0; i < n3; ++i) {
                        n = 3 - 2 * ((n2 + i) % 4);
                        ((short[][])object)[n4][i] = f.f(g2, byArray, n2 + i + n);
                    }
                    n2 += n5;
                    ++n4;
                }
                return;
            }
            case 67109825: 
            case 67109826: {
                return;
            }
            case 0x4000401: 
            case 0x4000402: {
                return;
            }
            case 0x4000441: 
            case 0x4000442: {
                return;
            }
            case 67110017: 
            case 67110018: {
                n = 0;
                while (n < Array.getLength(object)) {
                    for (n4 = 0; n4 < n3; ++n4) {
                        ((short[][])object)[n][n4] = f.f(g2, byArray, n2 + n4);
                    }
                    n2 += n5;
                    ++n;
                }
                return;
            }
        }
    }

    private static void a(a.b.g object, byte[] byArray, int n, float f2) {
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = Converter.Cifp.a.b((int)Float.floatToIntBits(f2));
                int n2 = 0;
                while (n2 < 4) {
                    byArray[n + n2] = (byte)object[n2];
                    ++n2;
                }
                return;
            }
            case 3: {
                object = Converter.Cifp.a.b((int)Float.floatToIntBits(f2));
                int n3 = 0;
                while (n3 < 4) {
                    byArray[n + n3] = (byte)object[3 - n3];
                    ++n3;
                }
                return;
            }
        }
    }

    private static void a(a.b.g object, byte[] byArray, int n, double d) {
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = Converter.Cifp.a.a((long)Double.doubleToLongBits(d));
                int n2 = 0;
                while (n2 < 8) {
                    byArray[n + n2] = (byte)object[n2];
                    ++n2;
                }
                return;
            }
            case 3: {
                object = Converter.Cifp.a.a((long)Double.doubleToLongBits(d));
                int n3 = 0;
                while (n3 < 8) {
                    byArray[n + n3] = (byte)object[7 - n3];
                    ++n3;
                }
                return;
            }
        }
    }

    private static void a(a.b.g object, byte[] byArray, int n, int n2) {
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = Converter.Cifp.a.b((int)n2);
                n2 = 0;
                while (n2 < 4) {
                    byArray[n + n2] = (byte)object[n2];
                    ++n2;
                }
                return;
            }
            case 3: {
                object = Converter.Cifp.a.b((int)n2);
                n2 = 0;
                while (n2 < 4) {
                    byArray[n + n2] = (byte)object[3 - n2];
                    ++n2;
                }
                return;
            }
        }
    }

    private static void a(a.b.g object, byte[] byArray, int n, short s) {
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = Converter.Cifp.a.a((short)s);
                byArray[n] = (byte)object[0];
                byArray[n + 1] = (byte)object[1];
                return;
            }
            case 3: {
                object = Converter.Cifp.a.a((short)s);
                byArray[n] = (byte)object[1];
                byArray[n + 1] = (byte)object[0];
                break;
            }
        }
    }

    private static void b(a.b.g object, byte[] byArray, int n, int n2) {
        switch (1.a[object.ordinal()]) {
            case 1: 
            case 2: {
                object = Converter.Cifp.a.c((int)n2);
                byArray[n] = (byte)object[0];
                byArray[n + 1] = (byte)object[1];
                return;
            }
            case 3: {
                object = Converter.Cifp.a.c((int)n2);
                byArray[n] = (byte)object[1];
                byArray[n + 1] = (byte)object[0];
                break;
            }
        }
    }

    public static void a(a.b.g g2, int n, Object object, int n2, int n3, byte[] byArray, int n4) {
        if (!object.getClass().isArray()) throw new IllegalArgumentException("RepCodeConvertor.decode():data is not array");
        if (byArray == null) {
            throw new IllegalArgumentException("RepCodeConvertor.decode():data is not array");
        }
        Object object2 = Array.get(object, 0);
        switch (n) {
            case 0x4000001: 
            case 0x4000002: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        f.a(g2, byArray, n4, ((float[])object)[0]);
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n5 = 0;
                while (n5 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        f.a(g2, byArray, n4 + (n5 * n + n3 << 2), ((float[][])object)[n5][n3]);
                    }
                    ++n5;
                }
                return;
            }
            case 0x4000041: 
            case 0x4000042: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        f.a(g2, byArray, n4, ((double[])object)[0]);
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n6 = 0;
                while (n6 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        f.a(g2, byArray, n6 * n + n3 << 3, ((double[][])object)[n6][n3]);
                    }
                    ++n6;
                }
                return;
            }
            case 67109249: 
            case 67109250: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        f.a(g2, byArray, n4, ((int[])object)[0]);
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n7 = 0;
                while (n7 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        f.a(g2, byArray, n7 * n + n3 << 2, ((int[][])object)[n7][n3]);
                    }
                    ++n7;
                }
                return;
            }
            case 67109313: 
            case 67109314: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        f.a(g2, byArray, n4, ((short[])object)[0]);
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n8 = 0;
                while (n8 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        f.a(g2, byArray, n8 * n + n3 << 1, ((short[][])object)[n8][n3]);
                    }
                    ++n8;
                }
                return;
            }
            case 67109377: 
            case 0x4000202: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        byArray[n4] = ((byte[])object)[0];
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n9 = 0;
                while (n9 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        byArray[n4 + n9 * n + n3] = ((byte[][])object)[n9][n3];
                    }
                    ++n9;
                }
                return;
            }
            case 67109697: 
            case 67109698: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        f.b(g2, byArray, n4, ((int[])object)[0]);
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n10 = 0;
                while (n10 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        f.b(g2, byArray, n10 * n + n3 << 1, ((int[][])object)[n10][n3]);
                    }
                    ++n10;
                }
                return;
            }
            case 67109761: 
            case 67109762: {
                if (!object2.getClass().isArray()) {
                    n = 0;
                    while (n <= 0) {
                        byArray[n4] = (byte)((short[])object)[0];
                        ++n;
                    }
                    return;
                }
                n = Array.getLength(object2);
                int n11 = 0;
                while (n11 <= 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        byArray[n4 + n11 * n + n3] = (byte)((short[][])object)[n11][n3];
                    }
                    ++n11;
                }
                return;
            }
        }
    }

    static {
        if (!a.isEmpty()) return;
        a.add(new g(0x4000002, b.f, 4.0f, 2));
        a.add(new g(0x4000001, b.f, 4.0f, 1));
        a.add(new g(0x4000042, b.g, 8.0f, 2));
        a.add(new g(0x4000041, b.g, 8.0f, 1));
        a.add(new g(67109250, b.d, 4.0f, 2));
        a.add(new g(67109249, b.d, 4.0f, 1));
        a.add(new g(67109314, b.c, 2.0f, 2));
        a.add(new g(67109313, b.c, 2.0f, 1));
        a.add(new g(0x4000202, b.b, 1.0f, 2));
        a.add(new g(67109377, b.b, 1.0f, 1));
        a.add(new g(67109698, b.d, 2.0f, 2));
        a.add(new g(67109697, b.d, 2.0f, 1));
        a.add(new g(67109762, b.c, 1.0f, 2));
        a.add(new g(67109761, b.c, 1.0f, 1));
        a.add(new g(67109826, b.b, 0.5f, 2));
        a.add(new g(67109825, b.b, 0.5f, 1));
        a.add(new g(0x4000402, b.b, 0.25f, 2));
        a.add(new g(0x4000401, b.b, 0.25f, 1));
        a.add(new g(0x4000442, b.b, 0.125f, 2));
        a.add(new g(0x4000441, b.b, 0.125f, 1));
        a.add(new g(67110018, b.c, 1.0f, 2));
        a.add(new g(67110017, b.c, 1.0f, 1));
    }
}

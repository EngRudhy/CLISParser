/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  a.a.a.b
 *  a.a.a.d
 *  a.b.g
 */
package a.a.a;

import a.a.a.b;
import a.a.a.d;
import a.b.g;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public final class a {
    d a = null;
    public List<b> b = new ArrayList<b>();
    private RandomAccessFile c = null;
    private String d = null;
    private g e = g.d;

    public a(String string) {
        this.d = string;
        this.a = new d();
    }

    public final d a() {
        return this.a;
    }

    public final void b() {
        try {
            if (this.c == null) return;
            this.c.close();
            this.c = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final RandomAccessFile c() {
        try {
            if (this.c != null) {
                if (this.c.getChannel() != null) return this.c;
            }
            if (this.d == null) return this.c;
            this.c = new RandomAccessFile(this.d, "r");
            return this.c;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public final g d() {
        return this.e;
    }

    public final void a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile == null) {
            throw new IllegalArgumentException("ClisContent.load(): filestream is null");
        }
        this.c = randomAccessFile;
        if (this.a == null) {
            this.a = new d();
        }
        randomAccessFile.seek(0L);
        byte[] byArray = new byte[4096];
        randomAccessFile.read(byArray, 0, byArray.length);
        for (g g2 : g.a()) {
            this.a.a(g2, byArray);
            if (!this.a.v().substring(0, 4).equalsIgnoreCase("CLIS") || this.a.d() <= 0 || this.a.d() > 562 || this.a.e() != 562 || this.a.m() <= 0 || this.a.o() <= 0 || this.a.h() < 564 || this.a.i() <= this.a.h() || this.a.n() < 1024 || this.a.p() < 1024 || this.a.f() <= 0 || this.a.g() < 1024 || this.a.o() < 563) continue;
            this.e = g2;
            break;
        }
        if (this.e == g.d) {
            throw new IOException("ClisContent.load(): invalid clis file");
        }
        for (int i = 0; i < 562; ++i) {
            g g2;
            randomAccessFile.seek(i + 1 << 12);
            g2 = new b(this);
            g2.a(i);
            if (!g2.a(this.e, randomAccessFile)) continue;
            this.b.add((b)g2);
        }
        if (this.a.q().equals("EVENT") && this.a.r().isEmpty()) {
            this.a.a("s");
        }
        this.c = null;
    }

    public final boolean b(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile == null) {
            throw new IllegalArgumentException("ClisContent.load(): filestream is null");
        }
        this.c = randomAccessFile;
        if (this.a == null) {
            this.a = new d();
        }
        randomAccessFile.seek(0L);
        byte[] byArray = new byte[4096];
        int n = randomAccessFile.read(byArray, 0, byArray.length);
        if (n != byArray.length) {
            randomAccessFile.close();
            this.c = null;
            return false;
        }
        for (g g2 : g.a()) {
            this.a.a(g2, byArray);
            if (this.a.v().length() < 4 || !this.a.v().substring(0, 4).equalsIgnoreCase("CLIS") || this.a.d() <= 0 || this.a.d() > 562 || this.a.e() != 562 || this.a.m() <= 0 || this.a.o() <= 0 || this.a.h() < 564 || this.a.i() <= this.a.h() || this.a.n() < 1024 || this.a.p() < 1024 || this.a.f() <= 0 || this.a.g() < 1024 || this.a.o() < 563) continue;
            this.e = g2;
            break;
        }
        randomAccessFile.close();
        this.c = null;
        if (this.e != g.d) return true;
        return false;
    }

    public final void e() throws IOException {
        this.a = null;
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); ++i) {
                this.b.get(i).H();
            }
            this.b.clear();
            this.b = null;
        }
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
        this.e = null;
    }
}

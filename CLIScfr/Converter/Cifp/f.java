/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.g
 *  Converter.Cifp.h
 *  Converter.Cifp.v
 *  a.b.a.a
 *  a.b.f
 *  cif.dataengine.io.LogWell
 */
package Converter.Cifp;

import Converter.Cifp.a;
import Converter.Cifp.g;
import Converter.Cifp.h;
import Converter.Cifp.v;
import cif.dataengine.io.LogWell;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class f {
    private String a = null;
    private String b = "";
    private boolean c = false;
    private boolean d = false;
    private int e = 0;
    private List<a> f = new ArrayList<a>();
    private a.b.f g = null;
    private a.b.a.a h = null;

    public f(String string) {
        try {
            this.a = string;
            if (this.h == null) {
                this.h = new a.b.a.a();
            }
            if (this.g != null) return;
            this.g = new a.b.f();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final void a(int n) {
        this.e = n;
    }

    final void a(String string) {
        this.b = string;
    }

    final boolean a() {
        return this.d;
    }

    public final a.b.f b() {
        return this.g;
    }

    public final a.b.a.a c() {
        return this.h;
    }

    public final String d() {
        return this.a;
    }

    public final List<a> e() {
        return this.f;
    }

    public final void a(a a2) throws Exception, IllegalArgumentException {
        if (a2 == null) {
            throw new IllegalArgumentException("CifpFile.addCategory():cifpCategory is null!");
        }
        boolean bl = false;
        for (int i = 0; i < this.f.size(); ++i) {
            if (!this.f.get(i).e().equals(a2.e())) continue;
            bl = true;
            break;
        }
        if (bl) throw new Exception("CifpFile.addCategory():Have the same name category in this file");
        this.f.add(a2);
    }

    public final void a(LogWell logWell, int n, String object) throws IOException {
        if (logWell == null) {
            throw new IllegalArgumentException("CifpFile.saveTo():LogWell is null");
        }
        if (((String)object).isEmpty()) {
            throw new IllegalArgumentException("CifpFile.saveTo():Category name is empty");
        }
        this.c = false;
        logWell = new g(this, n, (String)object, logWell);
        v v2 = new v(null, true);
        v2.setLocationRelativeTo(null);
        v2.setCursor(new Cursor(3));
        object = new Timer(20, null);
        ((Timer)object).addActionListener((ActionListener)new h(this, v2, (Timer)object));
        logWell.start();
        ((Timer)object).start();
        v2.setVisible(true);
        LogWell logWell2 = logWell;
        synchronized (logWell2) {
            if (!v2.a()) return;
            this.d = true;
            try {
                logWell.wait();
            }
            catch (Exception exception) {}
            ((Timer)object).stop();
            return;
        }
    }

    public final void f() {
        int n = this.f.size();
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.h.a();
                this.h = null;
                this.g.a();
                this.g = null;
                this.f.clear();
                this.d = false;
                this.b = "";
                this.c = false;
                this.e = 0;
                return;
            }
            this.f.get(n2).i();
            ++n2;
        }
    }

    static /* synthetic */ List a(f f2) {
        return f2.f;
    }

    static /* synthetic */ boolean a(f f2, boolean bl) {
        f2.c = true;
        return true;
    }

    static /* synthetic */ String b(f f2) {
        return f2.b;
    }

    static /* synthetic */ String a(f f2, String string) {
        f2.b = string;
        return f2.b;
    }

    static /* synthetic */ int c(f f2) {
        return f2.e;
    }

    static /* synthetic */ boolean d(f f2) {
        return f2.c;
    }

    static /* synthetic */ boolean b(f f2, boolean bl) {
        f2.d = true;
        return true;
    }
}

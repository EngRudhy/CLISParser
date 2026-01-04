/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.f
 *  cif.dataengine.io.LogWell
 */
package Converter.Cifp;

import Converter.Cifp.a;
import Converter.Cifp.f;
import cif.dataengine.io.LogWell;
import javax.swing.JOptionPane;

/*
 * Exception performing whole class analysis ignored.
 */
final class g
extends Thread {
    private /* synthetic */ int a;
    private /* synthetic */ String b;
    private /* synthetic */ LogWell c;
    private /* synthetic */ f d;

    g(f f2, int n, String string, LogWell logWell) {
        this.d = f2;
        this.a = n;
        this.b = string;
        this.c = logWell;
    }

    @Override
    public final void run() {
        try {
            ((a)f.a((f)this.d).get(this.a)).c(this.b);
            ((a)f.a((f)this.d).get(this.a)).a(this.c);
            f.a((f)this.d, (boolean)true);
            g g2 = this;
            synchronized (g2) {
                this.notify();
            }
        }
        catch (Exception exception) {
            f.a((f)this.d, (boolean)true);
            JOptionPane.showMessageDialog(null, exception.getMessage(), "\u9519\u8bef", 0);
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.f
 *  Converter.Cifp.v
 */
package Converter.Cifp;

import Converter.Cifp.f;
import Converter.Cifp.v;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.Timer;

/*
 * Exception performing whole class analysis ignored.
 */
final class h
implements ActionListener {
    private /* synthetic */ v a;
    private /* synthetic */ Timer b;
    private /* synthetic */ f c;

    h(f f2, v v2, Timer timer) {
        this.c = f2;
        this.a = v2;
        this.b = timer;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        if (f.b((f)this.c).isEmpty()) {
            f.a((f)this.c, (String)ResourceBundle.getBundle("Converter/Cifp/Bundle").getString("WAITING_INFO"));
        }
        this.a.a(f.b((f)this.c));
        this.a.a(f.c((f)this.c));
        if (!f.d((f)this.c)) {
            if (!this.a.a()) return;
        }
        if (this.a.a()) {
            f.b((f)this.c, (boolean)true);
        }
        this.b.stop();
        this.a.setCursor(new Cursor(0));
        this.a.setVisible(false);
    }
}

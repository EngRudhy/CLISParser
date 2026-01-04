/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.A
 */
package Converter.Cifp;

import Converter.Cifp.A;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Exception performing whole class analysis ignored.
 */
final class B
implements ActionListener {
    private /* synthetic */ A a;

    B(A a) {
        this.a = a;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        A.a((A)this.a, (ActionEvent)actionEvent);
    }
}

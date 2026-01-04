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
final class D
implements ActionListener {
    private /* synthetic */ A a;

    D(A a) {
        this.a = a;
    }

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        A.c((A)this.a, (ActionEvent)actionEvent);
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.l
 */
package Converter.Cifp;

import Converter.Cifp.l;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
final class n
extends MouseAdapter {
    private /* synthetic */ l a;

    n(l l2) {
        this.a = l2;
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        l.b((l)this.a, (MouseEvent)mouseEvent);
    }
}

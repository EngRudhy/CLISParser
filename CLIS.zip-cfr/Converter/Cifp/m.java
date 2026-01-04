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
final class m
extends MouseAdapter {
    private /* synthetic */ l a;

    m(l l2) {
        this.a = l2;
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        l.a((l)this.a, (MouseEvent)mouseEvent);
    }
}

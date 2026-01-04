/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.p
 */
package Converter.Cifp;

import Converter.Cifp.p;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
final class r
extends MouseAdapter {
    private /* synthetic */ p a;

    r(p p2) {
        this.a = p2;
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        p.a((p)this.a, (MouseEvent)mouseEvent);
    }
}

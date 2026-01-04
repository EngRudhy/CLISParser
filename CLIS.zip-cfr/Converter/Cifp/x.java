/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.v
 */
package Converter.Cifp;

import Converter.Cifp.v;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * Exception performing whole class analysis ignored.
 */
final class x
extends MouseAdapter {
    private /* synthetic */ v a;

    x(v v2) {
        this.a = v2;
    }

    @Override
    public final void mouseClicked(MouseEvent mouseEvent) {
        v.a((v)this.a, (MouseEvent)mouseEvent);
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.d
 *  Converter.Cifp.e
 *  Converter.Cifp.f
 *  a.a.a.a
 *  a.a.a.b
 *  a.a.a.d
 *  a.b.a
 *  cif.dataengine.io.LogWell
 *  cif.dataengine.io.WellProperties
 */
package a.a;

import Converter.Cifp.e;
import Converter.Cifp.f;
import a.a.a.b;
import a.a.a.d;
import cif.dataengine.io.LogWell;
import cif.dataengine.io.WellProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import javax.swing.JOptionPane;

public final class a
extends a.b.a {
    private a.a.a.a c = null;
    private RandomAccessFile d = null;

    public final void a(String string) {
        this.a = string;
    }

    public final void a() throws Exception {
        if (this.a.isEmpty()) {
            throw new Exception("File name not specified");
        }
        File file = new File(this.a);
        if (!file.exists()) {
            throw new Exception("File is not found");
        }
        if (this.d != null) {
            this.d.close();
        }
        this.d = new RandomAccessFile(this.a, "r");
        if (this.d == null) {
            return;
        }
        if (this.c != null) {
            this.c.e();
            this.c = null;
        }
        this.c = new a.a.a.a(this.a);
        try {
            this.c.a(this.d);
            this.d.close();
            this.d = null;
            return;
        }
        catch (Exception exception) {
            throw new Exception("ConverterClis.loadClisFile(): load clis file error");
        }
    }

    public final boolean a(LogWell logWell, int n, String string) {
        try {
            if (this.b == null) return false;
            if (this.b.e().size() <= 0) {
                return false;
            }
            this.b.a(logWell, n, string);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "\u9519\u8bef", 0);
            return false;
        }
        finally {
            if (this.c != null) {
                this.c.b();
            }
        }
        return true;
    }

    public final void b() {
        try {
            if (this.c == null) return;
            if (this.b != null) {
                this.b.f();
                this.b = null;
            }
            this.b = new f(this.a);
            String string = this.c.a().r();
            if (string == null || string.isEmpty()) {
                string = this.c.a().j();
            }
            Object object = this.b.c().a(string);
            if (this.b.c().b(string)) {
                object = "s";
            } else if (!((String)object).equalsIgnoreCase("meter") && !((String)object).equalsIgnoreCase("feet")) {
                object = "meter";
            }
            Converter.Cifp.a a2 = new Converter.Cifp.a(this.b);
            a2.b((String)object);
            a2.c(this.c.a().w());
            a2.a(this.c.a().w());
            WellProperties wellProperties = a2.b();
            object = this;
            if (wellProperties == null) {
                throw new IllegalArgumentException("category well properties is null");
            }
            wellProperties.setValue("wellName", ((a)((Object)object)).c.a().w());
            wellProperties.setValue("oilfield", ((a)((Object)object)).c.a().l());
            object = this.c.b.iterator();
            while (true) {
                if (!object.hasNext()) {
                    this.b.a(a2);
                    return;
                }
                wellProperties = (b)object.next();
                if ((wellProperties = Converter.Cifp.a.a((b)wellProperties, (d)this.c.a())) == null) continue;
                String string2 = Converter.Cifp.a.a((Converter.Cifp.a)a2, (e)e.a, (String)wellProperties.i());
                wellProperties.c(string2);
                if (this.b.c().b(string)) {
                    wellProperties.f();
                }
                a2.a((Converter.Cifp.d)wellProperties);
            }
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "\u9519\u8bef", 0);
            return;
        }
    }

    public static boolean b(String object) {
        try {
            a.a.a.a a2 = new a.a.a.a((String)object);
            object = new RandomAccessFile((String)object, "r");
            return a2.b((RandomAccessFile)object);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public final StringBuffer c() {
        try {
            this.a();
            if (this.c == null) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            d d2 = this.c.a();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("--------------------------------------FileHeaderInfo--------------------------------------\r\n");
            stringBuffer2.append(String.format("%-25S", "Well Name:"));
            stringBuffer2.append(d2.w() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Company Name:"));
            stringBuffer2.append(d2.a() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "State Name:"));
            stringBuffer2.append(d2.u() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Contry Name:"));
            stringBuffer2.append(d2.b() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "County Name:"));
            stringBuffer2.append(d2.c() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Field Name:"));
            stringBuffer2.append(d2.l() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Curve Count:"));
            stringBuffer2.append(d2.d() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Start Depth:"));
            stringBuffer2.append(d2.t() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "End Depth:"));
            stringBuffer2.append(d2.k() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Spacing:"));
            stringBuffer2.append(d2.s() + "\r\n");
            stringBuffer2.append(String.format("%-25S", "Depth Unit:"));
            CharSequence charSequence = d2.r();
            if (charSequence == null || ((String)charSequence).isEmpty()) {
                charSequence = d2.j();
            }
            stringBuffer2.append((String)charSequence + "\r\n");
            stringBuffer.append(stringBuffer2.toString());
            stringBuffer.append("\r\n");
            stringBuffer.append("--------------------------------------CurveHeaderInfo--------------------------------------\r\n");
            stringBuffer.append(String.format("%-10S", "NO"));
            stringBuffer.append(String.format("%-20S", "Name"));
            stringBuffer.append(String.format("%-20S", "Unit"));
            stringBuffer.append(String.format("%-10S", "Scale"));
            stringBuffer.append(String.format("%-10S", "Dimesion"));
            stringBuffer.append(String.format("%-20S", "StartDepth"));
            stringBuffer.append(String.format("%-20S", "EndDepth"));
            stringBuffer.append(String.format("%-20S", "Spacing"));
            stringBuffer.append("\r\n");
            int n = 1;
            Iterator iterator = this.c.b.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    stringBuffer.append("\r\n");
                    return stringBuffer;
                }
                d d3 = d2 = (b)iterator.next();
                int n2 = n++;
                charSequence = new StringBuffer();
                ((StringBuffer)charSequence).append(String.format("%-10S", n2));
                ((StringBuffer)charSequence).append(String.format("%-20S", d3.y()));
                ((StringBuffer)charSequence).append(String.format("%-20S", d3.D()));
                ((StringBuffer)charSequence).append(String.format("%-10S", d3.G()));
                ((StringBuffer)charSequence).append(String.format("%-10S", d3.v()));
                ((StringBuffer)charSequence).append(String.format("%-20S", d3.C()));
                ((StringBuffer)charSequence).append(String.format("%-20S", d3.w()));
                ((StringBuffer)charSequence).append(String.format("%-20S", d3.B()));
                ((StringBuffer)charSequence).append("\r\n");
                stringBuffer.append(((StringBuffer)charSequence).toString());
            }
        }
        catch (Exception exception) {
            return null;
        }
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Converter.Cifp.a
 *  Converter.Cifp.d
 *  Converter.Cifp.e
 *  Converter.Cifp.k
 *  a.b.b
 *  cif.dataengine.io.LogCategory
 *  cif.dataengine.io.Logging
 *  cif.dataengine.io.TableFields
 *  cif.dataengine.io.TableRecords
 */
package Converter.Cifp;

import Converter.Cifp.a;
import Converter.Cifp.d;
import Converter.Cifp.e;
import Converter.Cifp.k;
import a.b.b;
import cif.dataengine.io.LogCategory;
import cif.dataengine.io.Logging;
import cif.dataengine.io.TableFields;
import cif.dataengine.io.TableRecords;
import java.io.IOException;

public final class j
extends d {
    private TableFields d = new TableFields();
    private TableRecords e = new TableRecords();
    private k f = k.a;

    public j(a a2, String string) {
        super(a2);
        this.b = Converter.Cifp.e.b;
        this.c = string;
    }

    public final void a(int n, int n2) throws IllegalArgumentException {
        if (n2 <= 0) {
            throw new IllegalArgumentException("CifpTable.init(): field number is less than or equal to zero");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("CifpTable.init(): record number is less than or equal to zero");
        }
        this.d.init(n2);
        this.e.init(n, this.d);
    }

    public final void a(int n, b b2) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("CifpTable.setFieldDataType():field index is illegal");
        if (n >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setFieldDataType():field index is illegal");
        }
        this.d.setDataType(n, a.a((b)b2));
    }

    public final void b(int n, int n2) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("CifpTable.setFieldDataNum():field index is illegal");
        if (n >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setFieldDataNum():field index is illegal");
        }
        this.d.setDataNum(n, n2);
    }

    public final void a(int n, String string) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("CifpTable.setFieldName():field index is illegal");
        if (n >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setFieldName():field index is illegal");
        }
        this.d.setName(n, string);
    }

    public final void b(int n, String string) throws IllegalArgumentException {
        if (n < 0) throw new IllegalArgumentException("CifpTable.setFieldUnit():field index is illegal");
        if (n >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setFieldUnit():field index is illegal");
        }
        this.d.setUnit(n, string);
    }

    public final void a(int n, int n2, byte by) throws IllegalArgumentException {
        if (1 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordByteData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordByteData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordByteData():record index is illegal");
        }
        this.e.setRecordByteData(n, 1, by);
    }

    public final void a(int n, int n2, byte[] byArray) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordByteData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordByteData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordByteData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordByteData():record index is illegal");
        }
        this.e.setRecordByteData(n, n2, byArray);
    }

    public final void a(int n, int n2, double d2) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordDoubleData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordDoubleData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordDoubleData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordDoubleData():record index is illegal");
        }
        this.e.setRecordDoubleData(n, n2, d2);
    }

    public final void a(int n, int n2, double[] dArray) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordDoubleData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordDoubleData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordDoubleData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordDoubleData():record index is illegal");
        }
        this.e.setRecordDoubleData(n, n2, dArray);
    }

    public final void a(int n, int n2, float f) throws IllegalArgumentException {
        if (1 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordFloatData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordFloatData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordFloatData():record index is illegal");
        }
        this.e.setRecordFloatData(n, 1, f);
    }

    public final void a(int n, int n2, float[] fArray) throws IllegalArgumentException, NullPointerException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordFloatData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordFloatData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordFloatData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordFloatData():record index is illegal");
        }
        this.e.setRecordFloatData(n, n2, fArray);
    }

    public final void a(int n, int n2, int n3) throws IllegalArgumentException {
        if (1 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordIntData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordIntData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordIntData():record index is illegal");
        }
        this.e.setRecordIntData(n, 1, n3);
    }

    public final void a(int n, int n2, int[] nArray) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordIntData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordIntData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordIntData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordIntData():record index is illegal");
        }
        this.e.setRecordIntData(n, n2, nArray);
    }

    public final void a(int n, int n2, long l) throws IllegalArgumentException {
        if (1 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordLongData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordLongData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordLongData():record index is illegal");
        }
        this.e.setRecordLongData(n, 1, l);
    }

    public final void a(int n, int n2, long[] lArray) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordLongData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordLongData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordLongData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordLongData():record index is illegal");
        }
        this.e.setRecordLongData(n, n2, lArray);
    }

    public final void a(int n, int n2, short s) throws IllegalArgumentException {
        if (1 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordShortData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordShortData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordShortData():record index is illegal");
        }
        this.e.setRecordShortData(n, 1, s);
    }

    public final void a(int n, int n2, short[] sArray) throws IllegalArgumentException {
        if (n2 < 0) throw new IllegalArgumentException("CifpTable.setRecordShortData():field index is illegal");
        if (n2 >= this.d.getFieldNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordShortData():field index is illegal");
        }
        if (n < 0) throw new IllegalArgumentException("CifpTable.setRecordShortData():record index is illegal");
        if (n >= this.e.getRecordsNum()) {
            throw new IllegalArgumentException("CifpTable.setRecordShortData():record index is illegal");
        }
        this.e.setRecordShortData(n, n2, sArray);
    }

    public final Logging a(LogCategory logCategory) throws IOException, IllegalArgumentException {
        if (logCategory == null) {
            throw new IllegalArgumentException("CifpTable.write():category object is null");
        }
        if (this.c.isEmpty()) {
            throw new IllegalArgumentException("CifpTable.write():_name is empty");
        }
        Logging logging = logCategory.getLogging(this.c);
        if (logging != null) {
            this.c = a.a((LogCategory)logCategory, (String)this.c);
        }
        if ((logCategory = logCategory.createTable(this.c, "", this.f.a(), this.e)) != null) return logCategory;
        throw new IOException("CifpTable.write():create table error");
    }

    public final void g() {
        this.d = null;
        this.e = null;
        this.f = null;
    }
}

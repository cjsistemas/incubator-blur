/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.nearinfinity.blur.thrift.generated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ColumnFamily implements TBase<ColumnFamily, ColumnFamily._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ColumnFamily");

  private static final TField FAMILY_FIELD_DESC = new TField("family", TType.STRING, (short)1);
  private static final TField RECORDS_FIELD_DESC = new TField("records", TType.MAP, (short)2);

  public String family;
  public Map<String,Set<Column>> records;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    FAMILY((short)1, "family"),
    RECORDS((short)2, "records");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FAMILY
          return FAMILY;
        case 2: // RECORDS
          return RECORDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FAMILY, new FieldMetaData("family", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.RECORDS, new FieldMetaData("records", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new SetMetaData(TType.SET, 
                new StructMetaData(TType.STRUCT, Column.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ColumnFamily.class, metaDataMap);
  }

  public ColumnFamily() {
  }

  public ColumnFamily(
    String family,
    Map<String,Set<Column>> records)
  {
    this();
    this.family = family;
    this.records = records;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnFamily(ColumnFamily other) {
    if (other.isSetFamily()) {
      this.family = other.family;
    }
    if (other.isSetRecords()) {
      Map<String,Set<Column>> __this__records = new HashMap<String,Set<Column>>();
      for (Map.Entry<String, Set<Column>> other_element : other.records.entrySet()) {

        String other_element_key = other_element.getKey();
        Set<Column> other_element_value = other_element.getValue();

        String __this__records_copy_key = other_element_key;

        Set<Column> __this__records_copy_value = new HashSet<Column>();
        for (Column other_element_value_element : other_element_value) {
          __this__records_copy_value.add(new Column(other_element_value_element));
        }

        __this__records.put(__this__records_copy_key, __this__records_copy_value);
      }
      this.records = __this__records;
    }
  }

  public ColumnFamily deepCopy() {
    return new ColumnFamily(this);
  }

  @Override
  public void clear() {
    this.family = null;
    this.records = null;
  }

  public String getFamily() {
    return this.family;
  }

  public ColumnFamily setFamily(String family) {
    this.family = family;
    return this;
  }

  public void unsetFamily() {
    this.family = null;
  }

  /** Returns true if field family is set (has been asigned a value) and false otherwise */
  public boolean isSetFamily() {
    return this.family != null;
  }

  public void setFamilyIsSet(boolean value) {
    if (!value) {
      this.family = null;
    }
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public void putToRecords(String key, Set<Column> val) {
    if (this.records == null) {
      this.records = new HashMap<String,Set<Column>>();
    }
    this.records.put(key, val);
  }

  public Map<String,Set<Column>> getRecords() {
    return this.records;
  }

  public ColumnFamily setRecords(Map<String,Set<Column>> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been asigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FAMILY:
      if (value == null) {
        unsetFamily();
      } else {
        setFamily((String)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((Map<String,Set<Column>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FAMILY:
      return getFamily();

    case RECORDS:
      return getRecords();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FAMILY:
      return isSetFamily();
    case RECORDS:
      return isSetRecords();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnFamily)
      return this.equals((ColumnFamily)that);
    return false;
  }

  public boolean equals(ColumnFamily that) {
    if (that == null)
      return false;

    boolean this_present_family = true && this.isSetFamily();
    boolean that_present_family = true && that.isSetFamily();
    if (this_present_family || that_present_family) {
      if (!(this_present_family && that_present_family))
        return false;
      if (!this.family.equals(that.family))
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ColumnFamily other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ColumnFamily typedOther = (ColumnFamily)other;

    lastComparison = Boolean.valueOf(isSetFamily()).compareTo(typedOther.isSetFamily());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFamily()) {
      lastComparison = TBaseHelper.compareTo(this.family, typedOther.family);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(typedOther.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = TBaseHelper.compareTo(this.records, typedOther.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FAMILY
          if (field.type == TType.STRING) {
            this.family = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RECORDS
          if (field.type == TType.MAP) {
            {
              TMap _map42 = iprot.readMapBegin();
              this.records = new HashMap<String,Set<Column>>(2*_map42.size);
              for (int _i43 = 0; _i43 < _map42.size; ++_i43)
              {
                String _key44;
                Set<Column> _val45;
                _key44 = iprot.readString();
                {
                  TSet _set46 = iprot.readSetBegin();
                  _val45 = new HashSet<Column>(2*_set46.size);
                  for (int _i47 = 0; _i47 < _set46.size; ++_i47)
                  {
                    Column _elem48;
                    _elem48 = new Column();
                    _elem48.read(iprot);
                    _val45.add(_elem48);
                  }
                  iprot.readSetEnd();
                }
                this.records.put(_key44, _val45);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.family != null) {
      oprot.writeFieldBegin(FAMILY_FIELD_DESC);
      oprot.writeString(this.family);
      oprot.writeFieldEnd();
    }
    if (this.records != null) {
      oprot.writeFieldBegin(RECORDS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.SET, this.records.size()));
        for (Map.Entry<String, Set<Column>> _iter49 : this.records.entrySet())
        {
          oprot.writeString(_iter49.getKey());
          {
            oprot.writeSetBegin(new TSet(TType.STRUCT, _iter49.getValue().size()));
            for (Column _iter50 : _iter49.getValue())
            {
              _iter50.write(oprot);
            }
            oprot.writeSetEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ColumnFamily(");
    boolean first = true;

    sb.append("family:");
    if (this.family == null) {
      sb.append("null");
    } else {
      sb.append(this.family);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("records:");
    if (this.records == null) {
      sb.append("null");
    } else {
      sb.append(this.records);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

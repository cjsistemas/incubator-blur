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

public class BlurQuerySuggestions implements org.apache.thrift.TBase<BlurQuerySuggestions, BlurQuerySuggestions._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BlurQuerySuggestions");

  private static final org.apache.thrift.protocol.TField QUERY_SUGGESTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("querySuggestions", org.apache.thrift.protocol.TType.LIST, (short)1);

  public List<BlurQuerySuggestion> querySuggestions;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUERY_SUGGESTIONS((short)1, "querySuggestions");

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
        case 1: // QUERY_SUGGESTIONS
          return QUERY_SUGGESTIONS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY_SUGGESTIONS, new org.apache.thrift.meta_data.FieldMetaData("querySuggestions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BlurQuerySuggestion.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BlurQuerySuggestions.class, metaDataMap);
  }

  public BlurQuerySuggestions() {
  }

  public BlurQuerySuggestions(
    List<BlurQuerySuggestion> querySuggestions)
  {
    this();
    this.querySuggestions = querySuggestions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BlurQuerySuggestions(BlurQuerySuggestions other) {
    if (other.isSetQuerySuggestions()) {
      List<BlurQuerySuggestion> __this__querySuggestions = new ArrayList<BlurQuerySuggestion>();
      for (BlurQuerySuggestion other_element : other.querySuggestions) {
        __this__querySuggestions.add(new BlurQuerySuggestion(other_element));
      }
      this.querySuggestions = __this__querySuggestions;
    }
  }

  public BlurQuerySuggestions deepCopy() {
    return new BlurQuerySuggestions(this);
  }

  @Override
  public void clear() {
    this.querySuggestions = null;
  }

  public int getQuerySuggestionsSize() {
    return (this.querySuggestions == null) ? 0 : this.querySuggestions.size();
  }

  public java.util.Iterator<BlurQuerySuggestion> getQuerySuggestionsIterator() {
    return (this.querySuggestions == null) ? null : this.querySuggestions.iterator();
  }

  public void addToQuerySuggestions(BlurQuerySuggestion elem) {
    if (this.querySuggestions == null) {
      this.querySuggestions = new ArrayList<BlurQuerySuggestion>();
    }
    this.querySuggestions.add(elem);
  }

  public List<BlurQuerySuggestion> getQuerySuggestions() {
    return this.querySuggestions;
  }

  public BlurQuerySuggestions setQuerySuggestions(List<BlurQuerySuggestion> querySuggestions) {
    this.querySuggestions = querySuggestions;
    return this;
  }

  public void unsetQuerySuggestions() {
    this.querySuggestions = null;
  }

  /** Returns true if field querySuggestions is set (has been assigned a value) and false otherwise */
  public boolean isSetQuerySuggestions() {
    return this.querySuggestions != null;
  }

  public void setQuerySuggestionsIsSet(boolean value) {
    if (!value) {
      this.querySuggestions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUERY_SUGGESTIONS:
      if (value == null) {
        unsetQuerySuggestions();
      } else {
        setQuerySuggestions((List<BlurQuerySuggestion>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUERY_SUGGESTIONS:
      return getQuerySuggestions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUERY_SUGGESTIONS:
      return isSetQuerySuggestions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BlurQuerySuggestions)
      return this.equals((BlurQuerySuggestions)that);
    return false;
  }

  public boolean equals(BlurQuerySuggestions that) {
    if (that == null)
      return false;

    boolean this_present_querySuggestions = true && this.isSetQuerySuggestions();
    boolean that_present_querySuggestions = true && that.isSetQuerySuggestions();
    if (this_present_querySuggestions || that_present_querySuggestions) {
      if (!(this_present_querySuggestions && that_present_querySuggestions))
        return false;
      if (!this.querySuggestions.equals(that.querySuggestions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(BlurQuerySuggestions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    BlurQuerySuggestions typedOther = (BlurQuerySuggestions)other;

    lastComparison = Boolean.valueOf(isSetQuerySuggestions()).compareTo(typedOther.isSetQuerySuggestions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuerySuggestions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.querySuggestions, typedOther.querySuggestions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // QUERY_SUGGESTIONS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list62 = iprot.readListBegin();
              this.querySuggestions = new ArrayList<BlurQuerySuggestion>(_list62.size);
              for (int _i63 = 0; _i63 < _list62.size; ++_i63)
              {
                BlurQuerySuggestion _elem64;
                _elem64 = new BlurQuerySuggestion();
                _elem64.read(iprot);
                this.querySuggestions.add(_elem64);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.querySuggestions != null) {
      oprot.writeFieldBegin(QUERY_SUGGESTIONS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.querySuggestions.size()));
        for (BlurQuerySuggestion _iter65 : this.querySuggestions)
        {
          _iter65.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BlurQuerySuggestions(");
    boolean first = true;

    sb.append("querySuggestions:");
    if (this.querySuggestions == null) {
      sb.append("null");
    } else {
      sb.append(this.querySuggestions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}


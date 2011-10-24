/**
 * Autogenerated by Thrift Compiler (0.7.0)
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

public class AnalyzerDefinition implements org.apache.thrift.TBase<AnalyzerDefinition, AnalyzerDefinition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnalyzerDefinition");

  private static final org.apache.thrift.protocol.TField DEFAULT_DEFINITION_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultDefinition", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FULL_TEXT_ANALYZER_CLASS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fullTextAnalyzerClassName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMN_FAMILY_DEFINITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("columnFamilyDefinitions", org.apache.thrift.protocol.TType.MAP, (short)3);

  public ColumnDefinition defaultDefinition; // required
  public String fullTextAnalyzerClassName; // required
  public Map<String,ColumnFamilyDefinition> columnFamilyDefinitions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEFAULT_DEFINITION((short)1, "defaultDefinition"),
    FULL_TEXT_ANALYZER_CLASS_NAME((short)2, "fullTextAnalyzerClassName"),
    COLUMN_FAMILY_DEFINITIONS((short)3, "columnFamilyDefinitions");

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
        case 1: // DEFAULT_DEFINITION
          return DEFAULT_DEFINITION;
        case 2: // FULL_TEXT_ANALYZER_CLASS_NAME
          return FULL_TEXT_ANALYZER_CLASS_NAME;
        case 3: // COLUMN_FAMILY_DEFINITIONS
          return COLUMN_FAMILY_DEFINITIONS;
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
    tmpMap.put(_Fields.DEFAULT_DEFINITION, new org.apache.thrift.meta_data.FieldMetaData("defaultDefinition", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnDefinition.class)));
    tmpMap.put(_Fields.FULL_TEXT_ANALYZER_CLASS_NAME, new org.apache.thrift.meta_data.FieldMetaData("fullTextAnalyzerClassName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLUMN_FAMILY_DEFINITIONS, new org.apache.thrift.meta_data.FieldMetaData("columnFamilyDefinitions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnFamilyDefinition.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnalyzerDefinition.class, metaDataMap);
  }

  public AnalyzerDefinition() {
  }

  public AnalyzerDefinition(
    ColumnDefinition defaultDefinition,
    String fullTextAnalyzerClassName,
    Map<String,ColumnFamilyDefinition> columnFamilyDefinitions)
  {
    this();
    this.defaultDefinition = defaultDefinition;
    this.fullTextAnalyzerClassName = fullTextAnalyzerClassName;
    this.columnFamilyDefinitions = columnFamilyDefinitions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnalyzerDefinition(AnalyzerDefinition other) {
    if (other.isSetDefaultDefinition()) {
      this.defaultDefinition = new ColumnDefinition(other.defaultDefinition);
    }
    if (other.isSetFullTextAnalyzerClassName()) {
      this.fullTextAnalyzerClassName = other.fullTextAnalyzerClassName;
    }
    if (other.isSetColumnFamilyDefinitions()) {
      Map<String,ColumnFamilyDefinition> __this__columnFamilyDefinitions = new HashMap<String,ColumnFamilyDefinition>();
      for (Map.Entry<String, ColumnFamilyDefinition> other_element : other.columnFamilyDefinitions.entrySet()) {

        String other_element_key = other_element.getKey();
        ColumnFamilyDefinition other_element_value = other_element.getValue();

        String __this__columnFamilyDefinitions_copy_key = other_element_key;

        ColumnFamilyDefinition __this__columnFamilyDefinitions_copy_value = new ColumnFamilyDefinition(other_element_value);

        __this__columnFamilyDefinitions.put(__this__columnFamilyDefinitions_copy_key, __this__columnFamilyDefinitions_copy_value);
      }
      this.columnFamilyDefinitions = __this__columnFamilyDefinitions;
    }
  }

  public AnalyzerDefinition deepCopy() {
    return new AnalyzerDefinition(this);
  }

  @Override
  public void clear() {
    this.defaultDefinition = null;
    this.fullTextAnalyzerClassName = null;
    this.columnFamilyDefinitions = null;
  }

  public ColumnDefinition getDefaultDefinition() {
    return this.defaultDefinition;
  }

  public AnalyzerDefinition setDefaultDefinition(ColumnDefinition defaultDefinition) {
    this.defaultDefinition = defaultDefinition;
    return this;
  }

  public void unsetDefaultDefinition() {
    this.defaultDefinition = null;
  }

  /** Returns true if field defaultDefinition is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultDefinition() {
    return this.defaultDefinition != null;
  }

  public void setDefaultDefinitionIsSet(boolean value) {
    if (!value) {
      this.defaultDefinition = null;
    }
  }

  public String getFullTextAnalyzerClassName() {
    return this.fullTextAnalyzerClassName;
  }

  public AnalyzerDefinition setFullTextAnalyzerClassName(String fullTextAnalyzerClassName) {
    this.fullTextAnalyzerClassName = fullTextAnalyzerClassName;
    return this;
  }

  public void unsetFullTextAnalyzerClassName() {
    this.fullTextAnalyzerClassName = null;
  }

  /** Returns true if field fullTextAnalyzerClassName is set (has been assigned a value) and false otherwise */
  public boolean isSetFullTextAnalyzerClassName() {
    return this.fullTextAnalyzerClassName != null;
  }

  public void setFullTextAnalyzerClassNameIsSet(boolean value) {
    if (!value) {
      this.fullTextAnalyzerClassName = null;
    }
  }

  public int getColumnFamilyDefinitionsSize() {
    return (this.columnFamilyDefinitions == null) ? 0 : this.columnFamilyDefinitions.size();
  }

  public void putToColumnFamilyDefinitions(String key, ColumnFamilyDefinition val) {
    if (this.columnFamilyDefinitions == null) {
      this.columnFamilyDefinitions = new HashMap<String,ColumnFamilyDefinition>();
    }
    this.columnFamilyDefinitions.put(key, val);
  }

  public Map<String,ColumnFamilyDefinition> getColumnFamilyDefinitions() {
    return this.columnFamilyDefinitions;
  }

  public AnalyzerDefinition setColumnFamilyDefinitions(Map<String,ColumnFamilyDefinition> columnFamilyDefinitions) {
    this.columnFamilyDefinitions = columnFamilyDefinitions;
    return this;
  }

  public void unsetColumnFamilyDefinitions() {
    this.columnFamilyDefinitions = null;
  }

  /** Returns true if field columnFamilyDefinitions is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnFamilyDefinitions() {
    return this.columnFamilyDefinitions != null;
  }

  public void setColumnFamilyDefinitionsIsSet(boolean value) {
    if (!value) {
      this.columnFamilyDefinitions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEFAULT_DEFINITION:
      if (value == null) {
        unsetDefaultDefinition();
      } else {
        setDefaultDefinition((ColumnDefinition)value);
      }
      break;

    case FULL_TEXT_ANALYZER_CLASS_NAME:
      if (value == null) {
        unsetFullTextAnalyzerClassName();
      } else {
        setFullTextAnalyzerClassName((String)value);
      }
      break;

    case COLUMN_FAMILY_DEFINITIONS:
      if (value == null) {
        unsetColumnFamilyDefinitions();
      } else {
        setColumnFamilyDefinitions((Map<String,ColumnFamilyDefinition>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEFAULT_DEFINITION:
      return getDefaultDefinition();

    case FULL_TEXT_ANALYZER_CLASS_NAME:
      return getFullTextAnalyzerClassName();

    case COLUMN_FAMILY_DEFINITIONS:
      return getColumnFamilyDefinitions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEFAULT_DEFINITION:
      return isSetDefaultDefinition();
    case FULL_TEXT_ANALYZER_CLASS_NAME:
      return isSetFullTextAnalyzerClassName();
    case COLUMN_FAMILY_DEFINITIONS:
      return isSetColumnFamilyDefinitions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnalyzerDefinition)
      return this.equals((AnalyzerDefinition)that);
    return false;
  }

  public boolean equals(AnalyzerDefinition that) {
    if (that == null)
      return false;

    boolean this_present_defaultDefinition = true && this.isSetDefaultDefinition();
    boolean that_present_defaultDefinition = true && that.isSetDefaultDefinition();
    if (this_present_defaultDefinition || that_present_defaultDefinition) {
      if (!(this_present_defaultDefinition && that_present_defaultDefinition))
        return false;
      if (!this.defaultDefinition.equals(that.defaultDefinition))
        return false;
    }

    boolean this_present_fullTextAnalyzerClassName = true && this.isSetFullTextAnalyzerClassName();
    boolean that_present_fullTextAnalyzerClassName = true && that.isSetFullTextAnalyzerClassName();
    if (this_present_fullTextAnalyzerClassName || that_present_fullTextAnalyzerClassName) {
      if (!(this_present_fullTextAnalyzerClassName && that_present_fullTextAnalyzerClassName))
        return false;
      if (!this.fullTextAnalyzerClassName.equals(that.fullTextAnalyzerClassName))
        return false;
    }

    boolean this_present_columnFamilyDefinitions = true && this.isSetColumnFamilyDefinitions();
    boolean that_present_columnFamilyDefinitions = true && that.isSetColumnFamilyDefinitions();
    if (this_present_columnFamilyDefinitions || that_present_columnFamilyDefinitions) {
      if (!(this_present_columnFamilyDefinitions && that_present_columnFamilyDefinitions))
        return false;
      if (!this.columnFamilyDefinitions.equals(that.columnFamilyDefinitions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AnalyzerDefinition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AnalyzerDefinition typedOther = (AnalyzerDefinition)other;

    lastComparison = Boolean.valueOf(isSetDefaultDefinition()).compareTo(typedOther.isSetDefaultDefinition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultDefinition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultDefinition, typedOther.defaultDefinition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFullTextAnalyzerClassName()).compareTo(typedOther.isSetFullTextAnalyzerClassName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullTextAnalyzerClassName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullTextAnalyzerClassName, typedOther.fullTextAnalyzerClassName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumnFamilyDefinitions()).compareTo(typedOther.isSetColumnFamilyDefinitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnFamilyDefinitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columnFamilyDefinitions, typedOther.columnFamilyDefinitions);
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
        case 1: // DEFAULT_DEFINITION
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.defaultDefinition = new ColumnDefinition();
            this.defaultDefinition.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // FULL_TEXT_ANALYZER_CLASS_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.fullTextAnalyzerClassName = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COLUMN_FAMILY_DEFINITIONS
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map70 = iprot.readMapBegin();
              this.columnFamilyDefinitions = new HashMap<String,ColumnFamilyDefinition>(2*_map70.size);
              for (int _i71 = 0; _i71 < _map70.size; ++_i71)
              {
                String _key72; // required
                ColumnFamilyDefinition _val73; // required
                _key72 = iprot.readString();
                _val73 = new ColumnFamilyDefinition();
                _val73.read(iprot);
                this.columnFamilyDefinitions.put(_key72, _val73);
              }
              iprot.readMapEnd();
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
    if (this.defaultDefinition != null) {
      oprot.writeFieldBegin(DEFAULT_DEFINITION_FIELD_DESC);
      this.defaultDefinition.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.fullTextAnalyzerClassName != null) {
      oprot.writeFieldBegin(FULL_TEXT_ANALYZER_CLASS_NAME_FIELD_DESC);
      oprot.writeString(this.fullTextAnalyzerClassName);
      oprot.writeFieldEnd();
    }
    if (this.columnFamilyDefinitions != null) {
      oprot.writeFieldBegin(COLUMN_FAMILY_DEFINITIONS_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, this.columnFamilyDefinitions.size()));
        for (Map.Entry<String, ColumnFamilyDefinition> _iter74 : this.columnFamilyDefinitions.entrySet())
        {
          oprot.writeString(_iter74.getKey());
          _iter74.getValue().write(oprot);
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
    StringBuilder sb = new StringBuilder("AnalyzerDefinition(");
    boolean first = true;

    sb.append("defaultDefinition:");
    if (this.defaultDefinition == null) {
      sb.append("null");
    } else {
      sb.append(this.defaultDefinition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fullTextAnalyzerClassName:");
    if (this.fullTextAnalyzerClassName == null) {
      sb.append("null");
    } else {
      sb.append(this.fullTextAnalyzerClassName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columnFamilyDefinitions:");
    if (this.columnFamilyDefinitions == null) {
      sb.append("null");
    } else {
      sb.append(this.columnFamilyDefinitions);
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

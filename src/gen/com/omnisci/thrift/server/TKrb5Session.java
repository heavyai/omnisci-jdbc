/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.omnisci.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TKrb5Session implements org.apache.thrift.TBase<TKrb5Session, TKrb5Session._Fields>, java.io.Serializable, Cloneable, Comparable<TKrb5Session> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TKrb5Session");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KRB_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("krbToken", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TKrb5SessionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TKrb5SessionTupleSchemeFactory();

  public java.lang.String sessionId; // required
  public java.lang.String krbToken; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    KRB_TOKEN((short)2, "krbToken");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // KRB_TOKEN
          return KRB_TOKEN;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TSessionId")));
    tmpMap.put(_Fields.KRB_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("krbToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TKrb5Token")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TKrb5Session.class, metaDataMap);
  }

  public TKrb5Session() {
  }

  public TKrb5Session(
    java.lang.String sessionId,
    java.lang.String krbToken)
  {
    this();
    this.sessionId = sessionId;
    this.krbToken = krbToken;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TKrb5Session(TKrb5Session other) {
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
    if (other.isSetKrbToken()) {
      this.krbToken = other.krbToken;
    }
  }

  public TKrb5Session deepCopy() {
    return new TKrb5Session(this);
  }

  @Override
  public void clear() {
    this.sessionId = null;
    this.krbToken = null;
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public TKrb5Session setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public void unsetSessionId() {
    this.sessionId = null;
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return this.sessionId != null;
  }

  public void setSessionIdIsSet(boolean value) {
    if (!value) {
      this.sessionId = null;
    }
  }

  public java.lang.String getKrbToken() {
    return this.krbToken;
  }

  public TKrb5Session setKrbToken(java.lang.String krbToken) {
    this.krbToken = krbToken;
    return this;
  }

  public void unsetKrbToken() {
    this.krbToken = null;
  }

  /** Returns true if field krbToken is set (has been assigned a value) and false otherwise */
  public boolean isSetKrbToken() {
    return this.krbToken != null;
  }

  public void setKrbTokenIsSet(boolean value) {
    if (!value) {
      this.krbToken = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.String)value);
      }
      break;

    case KRB_TOKEN:
      if (value == null) {
        unsetKrbToken();
      } else {
        setKrbToken((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case KRB_TOKEN:
      return getKrbToken();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case KRB_TOKEN:
      return isSetKrbToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TKrb5Session)
      return this.equals((TKrb5Session)that);
    return false;
  }

  public boolean equals(TKrb5Session that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    boolean this_present_krbToken = true && this.isSetKrbToken();
    boolean that_present_krbToken = true && that.isSetKrbToken();
    if (this_present_krbToken || that_present_krbToken) {
      if (!(this_present_krbToken && that_present_krbToken))
        return false;
      if (!this.krbToken.equals(that.krbToken))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSessionId()) ? 131071 : 524287);
    if (isSetSessionId())
      hashCode = hashCode * 8191 + sessionId.hashCode();

    hashCode = hashCode * 8191 + ((isSetKrbToken()) ? 131071 : 524287);
    if (isSetKrbToken())
      hashCode = hashCode * 8191 + krbToken.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TKrb5Session other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKrbToken()).compareTo(other.isSetKrbToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKrbToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.krbToken, other.krbToken);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TKrb5Session(");
    boolean first = true;

    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("krbToken:");
    if (this.krbToken == null) {
      sb.append("null");
    } else {
      sb.append(this.krbToken);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TKrb5SessionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKrb5SessionStandardScheme getScheme() {
      return new TKrb5SessionStandardScheme();
    }
  }

  private static class TKrb5SessionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TKrb5Session> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TKrb5Session struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionId = iprot.readString();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KRB_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.krbToken = iprot.readString();
              struct.setKrbTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TKrb5Session struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sessionId != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionId);
        oprot.writeFieldEnd();
      }
      if (struct.krbToken != null) {
        oprot.writeFieldBegin(KRB_TOKEN_FIELD_DESC);
        oprot.writeString(struct.krbToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TKrb5SessionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TKrb5SessionTupleScheme getScheme() {
      return new TKrb5SessionTupleScheme();
    }
  }

  private static class TKrb5SessionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TKrb5Session> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TKrb5Session struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSessionId()) {
        optionals.set(0);
      }
      if (struct.isSetKrbToken()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSessionId()) {
        oprot.writeString(struct.sessionId);
      }
      if (struct.isSetKrbToken()) {
        oprot.writeString(struct.krbToken);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TKrb5Session struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sessionId = iprot.readString();
        struct.setSessionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.krbToken = iprot.readString();
        struct.setKrbTokenIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

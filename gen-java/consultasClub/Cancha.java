/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package consultasClub;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
//@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-18")
public class Cancha implements org.apache.thrift.TBase<Cancha, Cancha._Fields>, java.io.Serializable, Cloneable, Comparable<Cancha> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cancha");

  private static final org.apache.thrift.protocol.TField IDCANCHA_FIELD_DESC = new org.apache.thrift.protocol.TField("idcancha", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IDFILIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("idfilial", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_CANCHA_FIELD_DESC = new org.apache.thrift.protocol.TField("num_cancha", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField DEPORTE_FIELD_DESC = new org.apache.thrift.protocol.TField("deporte", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CATEGORIA_FIELD_DESC = new org.apache.thrift.protocol.TField("categoria", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CanchaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CanchaTupleSchemeFactory();

  public int idcancha; // required
  public int idfilial; // required
  public int num_cancha; // required
  public java.lang.String deporte; // required
  public java.lang.String categoria; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDCANCHA((short)1, "idcancha"),
    IDFILIAL((short)2, "idfilial"),
    NUM_CANCHA((short)3, "num_cancha"),
    DEPORTE((short)4, "deporte"),
    CATEGORIA((short)5, "categoria");

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
        case 1: // IDCANCHA
          return IDCANCHA;
        case 2: // IDFILIAL
          return IDFILIAL;
        case 3: // NUM_CANCHA
          return NUM_CANCHA;
        case 4: // DEPORTE
          return DEPORTE;
        case 5: // CATEGORIA
          return CATEGORIA;
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
  private static final int __IDCANCHA_ISSET_ID = 0;
  private static final int __IDFILIAL_ISSET_ID = 1;
  private static final int __NUM_CANCHA_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDCANCHA, new org.apache.thrift.meta_data.FieldMetaData("idcancha", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IDFILIAL, new org.apache.thrift.meta_data.FieldMetaData("idfilial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_CANCHA, new org.apache.thrift.meta_data.FieldMetaData("num_cancha", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEPORTE, new org.apache.thrift.meta_data.FieldMetaData("deporte", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATEGORIA, new org.apache.thrift.meta_data.FieldMetaData("categoria", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cancha.class, metaDataMap);
  }

  public Cancha() {
  }

  public Cancha(
    int idcancha,
    int idfilial,
    int num_cancha,
    java.lang.String deporte,
    java.lang.String categoria)
  {
    this();
    this.idcancha = idcancha;
    setIdcanchaIsSet(true);
    this.idfilial = idfilial;
    setIdfilialIsSet(true);
    this.num_cancha = num_cancha;
    setNum_canchaIsSet(true);
    this.deporte = deporte;
    this.categoria = categoria;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cancha(Cancha other) {
    __isset_bitfield = other.__isset_bitfield;
    this.idcancha = other.idcancha;
    this.idfilial = other.idfilial;
    this.num_cancha = other.num_cancha;
    if (other.isSetDeporte()) {
      this.deporte = other.deporte;
    }
    if (other.isSetCategoria()) {
      this.categoria = other.categoria;
    }
  }

  public Cancha deepCopy() {
    return new Cancha(this);
  }

  @Override
  public void clear() {
    setIdcanchaIsSet(false);
    this.idcancha = 0;
    setIdfilialIsSet(false);
    this.idfilial = 0;
    setNum_canchaIsSet(false);
    this.num_cancha = 0;
    this.deporte = null;
    this.categoria = null;
  }

  public int getIdcancha() {
    return this.idcancha;
  }

  public Cancha setIdcancha(int idcancha) {
    this.idcancha = idcancha;
    setIdcanchaIsSet(true);
    return this;
  }

  public void unsetIdcancha() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDCANCHA_ISSET_ID);
  }

  /** Returns true if field idcancha is set (has been assigned a value) and false otherwise */
  public boolean isSetIdcancha() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDCANCHA_ISSET_ID);
  }

  public void setIdcanchaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDCANCHA_ISSET_ID, value);
  }

  public int getIdfilial() {
    return this.idfilial;
  }

  public Cancha setIdfilial(int idfilial) {
    this.idfilial = idfilial;
    setIdfilialIsSet(true);
    return this;
  }

  public void unsetIdfilial() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDFILIAL_ISSET_ID);
  }

  /** Returns true if field idfilial is set (has been assigned a value) and false otherwise */
  public boolean isSetIdfilial() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDFILIAL_ISSET_ID);
  }

  public void setIdfilialIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDFILIAL_ISSET_ID, value);
  }

  public int getNum_cancha() {
    return this.num_cancha;
  }

  public Cancha setNum_cancha(int num_cancha) {
    this.num_cancha = num_cancha;
    setNum_canchaIsSet(true);
    return this;
  }

  public void unsetNum_cancha() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_CANCHA_ISSET_ID);
  }

  /** Returns true if field num_cancha is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_cancha() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_CANCHA_ISSET_ID);
  }

  public void setNum_canchaIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_CANCHA_ISSET_ID, value);
  }

  public java.lang.String getDeporte() {
    return this.deporte;
  }

  public Cancha setDeporte(java.lang.String deporte) {
    this.deporte = deporte;
    return this;
  }

  public void unsetDeporte() {
    this.deporte = null;
  }

  /** Returns true if field deporte is set (has been assigned a value) and false otherwise */
  public boolean isSetDeporte() {
    return this.deporte != null;
  }

  public void setDeporteIsSet(boolean value) {
    if (!value) {
      this.deporte = null;
    }
  }

  public java.lang.String getCategoria() {
    return this.categoria;
  }

  public Cancha setCategoria(java.lang.String categoria) {
    this.categoria = categoria;
    return this;
  }

  public void unsetCategoria() {
    this.categoria = null;
  }

  /** Returns true if field categoria is set (has been assigned a value) and false otherwise */
  public boolean isSetCategoria() {
    return this.categoria != null;
  }

  public void setCategoriaIsSet(boolean value) {
    if (!value) {
      this.categoria = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case IDCANCHA:
      if (value == null) {
        unsetIdcancha();
      } else {
        setIdcancha((java.lang.Integer)value);
      }
      break;

    case IDFILIAL:
      if (value == null) {
        unsetIdfilial();
      } else {
        setIdfilial((java.lang.Integer)value);
      }
      break;

    case NUM_CANCHA:
      if (value == null) {
        unsetNum_cancha();
      } else {
        setNum_cancha((java.lang.Integer)value);
      }
      break;

    case DEPORTE:
      if (value == null) {
        unsetDeporte();
      } else {
        setDeporte((java.lang.String)value);
      }
      break;

    case CATEGORIA:
      if (value == null) {
        unsetCategoria();
      } else {
        setCategoria((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IDCANCHA:
      return getIdcancha();

    case IDFILIAL:
      return getIdfilial();

    case NUM_CANCHA:
      return getNum_cancha();

    case DEPORTE:
      return getDeporte();

    case CATEGORIA:
      return getCategoria();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IDCANCHA:
      return isSetIdcancha();
    case IDFILIAL:
      return isSetIdfilial();
    case NUM_CANCHA:
      return isSetNum_cancha();
    case DEPORTE:
      return isSetDeporte();
    case CATEGORIA:
      return isSetCategoria();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Cancha)
      return this.equals((Cancha)that);
    return false;
  }

  public boolean equals(Cancha that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_idcancha = true;
    boolean that_present_idcancha = true;
    if (this_present_idcancha || that_present_idcancha) {
      if (!(this_present_idcancha && that_present_idcancha))
        return false;
      if (this.idcancha != that.idcancha)
        return false;
    }

    boolean this_present_idfilial = true;
    boolean that_present_idfilial = true;
    if (this_present_idfilial || that_present_idfilial) {
      if (!(this_present_idfilial && that_present_idfilial))
        return false;
      if (this.idfilial != that.idfilial)
        return false;
    }

    boolean this_present_num_cancha = true;
    boolean that_present_num_cancha = true;
    if (this_present_num_cancha || that_present_num_cancha) {
      if (!(this_present_num_cancha && that_present_num_cancha))
        return false;
      if (this.num_cancha != that.num_cancha)
        return false;
    }

    boolean this_present_deporte = true && this.isSetDeporte();
    boolean that_present_deporte = true && that.isSetDeporte();
    if (this_present_deporte || that_present_deporte) {
      if (!(this_present_deporte && that_present_deporte))
        return false;
      if (!this.deporte.equals(that.deporte))
        return false;
    }

    boolean this_present_categoria = true && this.isSetCategoria();
    boolean that_present_categoria = true && that.isSetCategoria();
    if (this_present_categoria || that_present_categoria) {
      if (!(this_present_categoria && that_present_categoria))
        return false;
      if (!this.categoria.equals(that.categoria))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + idcancha;

    hashCode = hashCode * 8191 + idfilial;

    hashCode = hashCode * 8191 + num_cancha;

    hashCode = hashCode * 8191 + ((isSetDeporte()) ? 131071 : 524287);
    if (isSetDeporte())
      hashCode = hashCode * 8191 + deporte.hashCode();

    hashCode = hashCode * 8191 + ((isSetCategoria()) ? 131071 : 524287);
    if (isSetCategoria())
      hashCode = hashCode * 8191 + categoria.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Cancha other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIdcancha()).compareTo(other.isSetIdcancha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdcancha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idcancha, other.idcancha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIdfilial()).compareTo(other.isSetIdfilial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdfilial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idfilial, other.idfilial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNum_cancha()).compareTo(other.isSetNum_cancha());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_cancha()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_cancha, other.num_cancha);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDeporte()).compareTo(other.isSetDeporte());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeporte()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deporte, other.deporte);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCategoria()).compareTo(other.isSetCategoria());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategoria()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categoria, other.categoria);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancha(");
    boolean first = true;

    sb.append("idcancha:");
    sb.append(this.idcancha);
    first = false;
    if (!first) sb.append(", ");
    sb.append("idfilial:");
    sb.append(this.idfilial);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_cancha:");
    sb.append(this.num_cancha);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deporte:");
    if (this.deporte == null) {
      sb.append("null");
    } else {
      sb.append(this.deporte);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("categoria:");
    if (this.categoria == null) {
      sb.append("null");
    } else {
      sb.append(this.categoria);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_cancha' because it's a primitive and you chose the non-beans generator.
    if (deporte == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'deporte' was not present! Struct: " + toString());
    }
    if (categoria == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'categoria' was not present! Struct: " + toString());
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CanchaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CanchaStandardScheme getScheme() {
      return new CanchaStandardScheme();
    }
  }

  private static class CanchaStandardScheme extends org.apache.thrift.scheme.StandardScheme<Cancha> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDCANCHA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idcancha = iprot.readI32();
              struct.setIdcanchaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IDFILIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idfilial = iprot.readI32();
              struct.setIdfilialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_CANCHA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_cancha = iprot.readI32();
              struct.setNum_canchaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEPORTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deporte = iprot.readString();
              struct.setDeporteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CATEGORIA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.categoria = iprot.readString();
              struct.setCategoriaIsSet(true);
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
      if (!struct.isSetNum_cancha()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_cancha' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Cancha struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IDCANCHA_FIELD_DESC);
      oprot.writeI32(struct.idcancha);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IDFILIAL_FIELD_DESC);
      oprot.writeI32(struct.idfilial);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_CANCHA_FIELD_DESC);
      oprot.writeI32(struct.num_cancha);
      oprot.writeFieldEnd();
      if (struct.deporte != null) {
        oprot.writeFieldBegin(DEPORTE_FIELD_DESC);
        oprot.writeString(struct.deporte);
        oprot.writeFieldEnd();
      }
      if (struct.categoria != null) {
        oprot.writeFieldBegin(CATEGORIA_FIELD_DESC);
        oprot.writeString(struct.categoria);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CanchaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CanchaTupleScheme getScheme() {
      return new CanchaTupleScheme();
    }
  }

  private static class CanchaTupleScheme extends org.apache.thrift.scheme.TupleScheme<Cancha> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_cancha);
      oprot.writeString(struct.deporte);
      oprot.writeString(struct.categoria);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIdcancha()) {
        optionals.set(0);
      }
      if (struct.isSetIdfilial()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIdcancha()) {
        oprot.writeI32(struct.idcancha);
      }
      if (struct.isSetIdfilial()) {
        oprot.writeI32(struct.idfilial);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cancha struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_cancha = iprot.readI32();
      struct.setNum_canchaIsSet(true);
      struct.deporte = iprot.readString();
      struct.setDeporteIsSet(true);
      struct.categoria = iprot.readString();
      struct.setCategoriaIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.idcancha = iprot.readI32();
        struct.setIdcanchaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.idfilial = iprot.readI32();
        struct.setIdfilialIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


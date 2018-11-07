/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package consultasClub;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-06")
public class Filial implements org.apache.thrift.TBase<Filial, Filial._Fields>, java.io.Serializable, Cloneable, Comparable<Filial> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Filial");

  private static final org.apache.thrift.protocol.TField IDFILIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("idfilial", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LOCALIDAD_FIELD_DESC = new org.apache.thrift.protocol.TField("localidad", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HORARIO_APERTURA_FIELD_DESC = new org.apache.thrift.protocol.TField("horario_apertura", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HORARIO_CIERRE_FIELD_DESC = new org.apache.thrift.protocol.TField("horario_cierre", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DIAMES_MANTENIMIENTO_FIELD_DESC = new org.apache.thrift.protocol.TField("diames_mantenimiento", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FilialStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FilialTupleSchemeFactory();

  public int idfilial; // required
  public java.lang.String localidad; // required
  public java.lang.String horario_apertura; // required
  public java.lang.String horario_cierre; // required
  public int diames_mantenimiento; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDFILIAL((short)1, "idfilial"),
    LOCALIDAD((short)2, "localidad"),
    HORARIO_APERTURA((short)3, "horario_apertura"),
    HORARIO_CIERRE((short)4, "horario_cierre"),
    DIAMES_MANTENIMIENTO((short)5, "diames_mantenimiento");

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
        case 1: // IDFILIAL
          return IDFILIAL;
        case 2: // LOCALIDAD
          return LOCALIDAD;
        case 3: // HORARIO_APERTURA
          return HORARIO_APERTURA;
        case 4: // HORARIO_CIERRE
          return HORARIO_CIERRE;
        case 5: // DIAMES_MANTENIMIENTO
          return DIAMES_MANTENIMIENTO;
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
  private static final int __IDFILIAL_ISSET_ID = 0;
  private static final int __DIAMES_MANTENIMIENTO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDFILIAL, new org.apache.thrift.meta_data.FieldMetaData("idfilial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOCALIDAD, new org.apache.thrift.meta_data.FieldMetaData("localidad", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HORARIO_APERTURA, new org.apache.thrift.meta_data.FieldMetaData("horario_apertura", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HORARIO_CIERRE, new org.apache.thrift.meta_data.FieldMetaData("horario_cierre", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DIAMES_MANTENIMIENTO, new org.apache.thrift.meta_data.FieldMetaData("diames_mantenimiento", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Filial.class, metaDataMap);
  }

  public Filial() {
  }

  public Filial(
    int idfilial,
    java.lang.String localidad,
    java.lang.String horario_apertura,
    java.lang.String horario_cierre,
    int diames_mantenimiento)
  {
    this();
    this.idfilial = idfilial;
    setIdfilialIsSet(true);
    this.localidad = localidad;
    this.horario_apertura = horario_apertura;
    this.horario_cierre = horario_cierre;
    this.diames_mantenimiento = diames_mantenimiento;
    setDiames_mantenimientoIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Filial(Filial other) {
    __isset_bitfield = other.__isset_bitfield;
    this.idfilial = other.idfilial;
    if (other.isSetLocalidad()) {
      this.localidad = other.localidad;
    }
    if (other.isSetHorario_apertura()) {
      this.horario_apertura = other.horario_apertura;
    }
    if (other.isSetHorario_cierre()) {
      this.horario_cierre = other.horario_cierre;
    }
    this.diames_mantenimiento = other.diames_mantenimiento;
  }

  public Filial deepCopy() {
    return new Filial(this);
  }

  @Override
  public void clear() {
    setIdfilialIsSet(false);
    this.idfilial = 0;
    this.localidad = null;
    this.horario_apertura = null;
    this.horario_cierre = null;
    setDiames_mantenimientoIsSet(false);
    this.diames_mantenimiento = 0;
  }

  public int getIdfilial() {
    return this.idfilial;
  }

  public Filial setIdfilial(int idfilial) {
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

  public java.lang.String getLocalidad() {
    return this.localidad;
  }

  public Filial setLocalidad(java.lang.String localidad) {
    this.localidad = localidad;
    return this;
  }

  public void unsetLocalidad() {
    this.localidad = null;
  }

  /** Returns true if field localidad is set (has been assigned a value) and false otherwise */
  public boolean isSetLocalidad() {
    return this.localidad != null;
  }

  public void setLocalidadIsSet(boolean value) {
    if (!value) {
      this.localidad = null;
    }
  }

  public java.lang.String getHorario_apertura() {
    return this.horario_apertura;
  }

  public Filial setHorario_apertura(java.lang.String horario_apertura) {
    this.horario_apertura = horario_apertura;
    return this;
  }

  public void unsetHorario_apertura() {
    this.horario_apertura = null;
  }

  /** Returns true if field horario_apertura is set (has been assigned a value) and false otherwise */
  public boolean isSetHorario_apertura() {
    return this.horario_apertura != null;
  }

  public void setHorario_aperturaIsSet(boolean value) {
    if (!value) {
      this.horario_apertura = null;
    }
  }

  public java.lang.String getHorario_cierre() {
    return this.horario_cierre;
  }

  public Filial setHorario_cierre(java.lang.String horario_cierre) {
    this.horario_cierre = horario_cierre;
    return this;
  }

  public void unsetHorario_cierre() {
    this.horario_cierre = null;
  }

  /** Returns true if field horario_cierre is set (has been assigned a value) and false otherwise */
  public boolean isSetHorario_cierre() {
    return this.horario_cierre != null;
  }

  public void setHorario_cierreIsSet(boolean value) {
    if (!value) {
      this.horario_cierre = null;
    }
  }

  public int getDiames_mantenimiento() {
    return this.diames_mantenimiento;
  }

  public Filial setDiames_mantenimiento(int diames_mantenimiento) {
    this.diames_mantenimiento = diames_mantenimiento;
    setDiames_mantenimientoIsSet(true);
    return this;
  }

  public void unsetDiames_mantenimiento() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DIAMES_MANTENIMIENTO_ISSET_ID);
  }

  /** Returns true if field diames_mantenimiento is set (has been assigned a value) and false otherwise */
  public boolean isSetDiames_mantenimiento() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DIAMES_MANTENIMIENTO_ISSET_ID);
  }

  public void setDiames_mantenimientoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DIAMES_MANTENIMIENTO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case IDFILIAL:
      if (value == null) {
        unsetIdfilial();
      } else {
        setIdfilial((java.lang.Integer)value);
      }
      break;

    case LOCALIDAD:
      if (value == null) {
        unsetLocalidad();
      } else {
        setLocalidad((java.lang.String)value);
      }
      break;

    case HORARIO_APERTURA:
      if (value == null) {
        unsetHorario_apertura();
      } else {
        setHorario_apertura((java.lang.String)value);
      }
      break;

    case HORARIO_CIERRE:
      if (value == null) {
        unsetHorario_cierre();
      } else {
        setHorario_cierre((java.lang.String)value);
      }
      break;

    case DIAMES_MANTENIMIENTO:
      if (value == null) {
        unsetDiames_mantenimiento();
      } else {
        setDiames_mantenimiento((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IDFILIAL:
      return getIdfilial();

    case LOCALIDAD:
      return getLocalidad();

    case HORARIO_APERTURA:
      return getHorario_apertura();

    case HORARIO_CIERRE:
      return getHorario_cierre();

    case DIAMES_MANTENIMIENTO:
      return getDiames_mantenimiento();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IDFILIAL:
      return isSetIdfilial();
    case LOCALIDAD:
      return isSetLocalidad();
    case HORARIO_APERTURA:
      return isSetHorario_apertura();
    case HORARIO_CIERRE:
      return isSetHorario_cierre();
    case DIAMES_MANTENIMIENTO:
      return isSetDiames_mantenimiento();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Filial)
      return this.equals((Filial)that);
    return false;
  }

  public boolean equals(Filial that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_idfilial = true;
    boolean that_present_idfilial = true;
    if (this_present_idfilial || that_present_idfilial) {
      if (!(this_present_idfilial && that_present_idfilial))
        return false;
      if (this.idfilial != that.idfilial)
        return false;
    }

    boolean this_present_localidad = true && this.isSetLocalidad();
    boolean that_present_localidad = true && that.isSetLocalidad();
    if (this_present_localidad || that_present_localidad) {
      if (!(this_present_localidad && that_present_localidad))
        return false;
      if (!this.localidad.equals(that.localidad))
        return false;
    }

    boolean this_present_horario_apertura = true && this.isSetHorario_apertura();
    boolean that_present_horario_apertura = true && that.isSetHorario_apertura();
    if (this_present_horario_apertura || that_present_horario_apertura) {
      if (!(this_present_horario_apertura && that_present_horario_apertura))
        return false;
      if (!this.horario_apertura.equals(that.horario_apertura))
        return false;
    }

    boolean this_present_horario_cierre = true && this.isSetHorario_cierre();
    boolean that_present_horario_cierre = true && that.isSetHorario_cierre();
    if (this_present_horario_cierre || that_present_horario_cierre) {
      if (!(this_present_horario_cierre && that_present_horario_cierre))
        return false;
      if (!this.horario_cierre.equals(that.horario_cierre))
        return false;
    }

    boolean this_present_diames_mantenimiento = true;
    boolean that_present_diames_mantenimiento = true;
    if (this_present_diames_mantenimiento || that_present_diames_mantenimiento) {
      if (!(this_present_diames_mantenimiento && that_present_diames_mantenimiento))
        return false;
      if (this.diames_mantenimiento != that.diames_mantenimiento)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + idfilial;

    hashCode = hashCode * 8191 + ((isSetLocalidad()) ? 131071 : 524287);
    if (isSetLocalidad())
      hashCode = hashCode * 8191 + localidad.hashCode();

    hashCode = hashCode * 8191 + ((isSetHorario_apertura()) ? 131071 : 524287);
    if (isSetHorario_apertura())
      hashCode = hashCode * 8191 + horario_apertura.hashCode();

    hashCode = hashCode * 8191 + ((isSetHorario_cierre()) ? 131071 : 524287);
    if (isSetHorario_cierre())
      hashCode = hashCode * 8191 + horario_cierre.hashCode();

    hashCode = hashCode * 8191 + diames_mantenimiento;

    return hashCode;
  }

  @Override
  public int compareTo(Filial other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetLocalidad()).compareTo(other.isSetLocalidad());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocalidad()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.localidad, other.localidad);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHorario_apertura()).compareTo(other.isSetHorario_apertura());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHorario_apertura()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.horario_apertura, other.horario_apertura);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHorario_cierre()).compareTo(other.isSetHorario_cierre());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHorario_cierre()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.horario_cierre, other.horario_cierre);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDiames_mantenimiento()).compareTo(other.isSetDiames_mantenimiento());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiames_mantenimiento()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diames_mantenimiento, other.diames_mantenimiento);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Filial(");
    boolean first = true;

    sb.append("idfilial:");
    sb.append(this.idfilial);
    first = false;
    if (!first) sb.append(", ");
    sb.append("localidad:");
    if (this.localidad == null) {
      sb.append("null");
    } else {
      sb.append(this.localidad);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("horario_apertura:");
    if (this.horario_apertura == null) {
      sb.append("null");
    } else {
      sb.append(this.horario_apertura);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("horario_cierre:");
    if (this.horario_cierre == null) {
      sb.append("null");
    } else {
      sb.append(this.horario_cierre);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("diames_mantenimiento:");
    sb.append(this.diames_mantenimiento);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FilialStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FilialStandardScheme getScheme() {
      return new FilialStandardScheme();
    }
  }

  private static class FilialStandardScheme extends org.apache.thrift.scheme.StandardScheme<Filial> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Filial struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDFILIAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idfilial = iprot.readI32();
              struct.setIdfilialIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCALIDAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.localidad = iprot.readString();
              struct.setLocalidadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HORARIO_APERTURA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.horario_apertura = iprot.readString();
              struct.setHorario_aperturaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HORARIO_CIERRE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.horario_cierre = iprot.readString();
              struct.setHorario_cierreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DIAMES_MANTENIMIENTO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.diames_mantenimiento = iprot.readI32();
              struct.setDiames_mantenimientoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Filial struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IDFILIAL_FIELD_DESC);
      oprot.writeI32(struct.idfilial);
      oprot.writeFieldEnd();
      if (struct.localidad != null) {
        oprot.writeFieldBegin(LOCALIDAD_FIELD_DESC);
        oprot.writeString(struct.localidad);
        oprot.writeFieldEnd();
      }
      if (struct.horario_apertura != null) {
        oprot.writeFieldBegin(HORARIO_APERTURA_FIELD_DESC);
        oprot.writeString(struct.horario_apertura);
        oprot.writeFieldEnd();
      }
      if (struct.horario_cierre != null) {
        oprot.writeFieldBegin(HORARIO_CIERRE_FIELD_DESC);
        oprot.writeString(struct.horario_cierre);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DIAMES_MANTENIMIENTO_FIELD_DESC);
      oprot.writeI32(struct.diames_mantenimiento);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FilialTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FilialTupleScheme getScheme() {
      return new FilialTupleScheme();
    }
  }

  private static class FilialTupleScheme extends org.apache.thrift.scheme.TupleScheme<Filial> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Filial struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIdfilial()) {
        optionals.set(0);
      }
      if (struct.isSetLocalidad()) {
        optionals.set(1);
      }
      if (struct.isSetHorario_apertura()) {
        optionals.set(2);
      }
      if (struct.isSetHorario_cierre()) {
        optionals.set(3);
      }
      if (struct.isSetDiames_mantenimiento()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetIdfilial()) {
        oprot.writeI32(struct.idfilial);
      }
      if (struct.isSetLocalidad()) {
        oprot.writeString(struct.localidad);
      }
      if (struct.isSetHorario_apertura()) {
        oprot.writeString(struct.horario_apertura);
      }
      if (struct.isSetHorario_cierre()) {
        oprot.writeString(struct.horario_cierre);
      }
      if (struct.isSetDiames_mantenimiento()) {
        oprot.writeI32(struct.diames_mantenimiento);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Filial struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.idfilial = iprot.readI32();
        struct.setIdfilialIsSet(true);
      }
      if (incoming.get(1)) {
        struct.localidad = iprot.readString();
        struct.setLocalidadIsSet(true);
      }
      if (incoming.get(2)) {
        struct.horario_apertura = iprot.readString();
        struct.setHorario_aperturaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.horario_cierre = iprot.readString();
        struct.setHorario_cierreIsSet(true);
      }
      if (incoming.get(4)) {
        struct.diames_mantenimiento = iprot.readI32();
        struct.setDiames_mantenimientoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


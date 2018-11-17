/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package consultasClub;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class Socio implements org.apache.thrift.TBase<Socio, Socio._Fields>, java.io.Serializable, Cloneable, Comparable<Socio> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Socio");

  private static final org.apache.thrift.protocol.TField IDSOCIO_FIELD_DESC = new org.apache.thrift.protocol.TField("idsocio", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_AFILIADO_FIELD_DESC = new org.apache.thrift.protocol.TField("num_afiliado", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NOMBRE_FIELD_DESC = new org.apache.thrift.protocol.TField("nombre", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField APELLIDO_FIELD_DESC = new org.apache.thrift.protocol.TField("apellido", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DIRECCION_FIELD_DESC = new org.apache.thrift.protocol.TField("direccion", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TELEFONO_FIELD_DESC = new org.apache.thrift.protocol.TField("telefono", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SocioStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SocioTupleSchemeFactory();

  public int idsocio; // required
  public int num_afiliado; // required
  public java.lang.String user; // required
  public java.lang.String nombre; // required
  public java.lang.String apellido; // required
  public java.lang.String direccion; // required
  public java.lang.String telefono; // required
  public java.lang.String email; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDSOCIO((short)1, "idsocio"),
    NUM_AFILIADO((short)2, "num_afiliado"),
    USER((short)3, "user"),
    NOMBRE((short)4, "nombre"),
    APELLIDO((short)5, "apellido"),
    DIRECCION((short)6, "direccion"),
    TELEFONO((short)7, "telefono"),
    EMAIL((short)8, "email");

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
        case 1: // IDSOCIO
          return IDSOCIO;
        case 2: // NUM_AFILIADO
          return NUM_AFILIADO;
        case 3: // USER
          return USER;
        case 4: // NOMBRE
          return NOMBRE;
        case 5: // APELLIDO
          return APELLIDO;
        case 6: // DIRECCION
          return DIRECCION;
        case 7: // TELEFONO
          return TELEFONO;
        case 8: // EMAIL
          return EMAIL;
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
  private static final int __IDSOCIO_ISSET_ID = 0;
  private static final int __NUM_AFILIADO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDSOCIO, new org.apache.thrift.meta_data.FieldMetaData("idsocio", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_AFILIADO, new org.apache.thrift.meta_data.FieldMetaData("num_afiliado", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOMBRE, new org.apache.thrift.meta_data.FieldMetaData("nombre", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APELLIDO, new org.apache.thrift.meta_data.FieldMetaData("apellido", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DIRECCION, new org.apache.thrift.meta_data.FieldMetaData("direccion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TELEFONO, new org.apache.thrift.meta_data.FieldMetaData("telefono", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Socio.class, metaDataMap);
  }

  public Socio() {
  }

  public Socio(
    int idsocio,
    int num_afiliado,
    java.lang.String user,
    java.lang.String nombre,
    java.lang.String apellido,
    java.lang.String direccion,
    java.lang.String telefono,
    java.lang.String email)
  {
    this();
    this.idsocio = idsocio;
    setIdsocioIsSet(true);
    this.num_afiliado = num_afiliado;
    setNum_afiliadoIsSet(true);
    this.user = user;
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Socio(Socio other) {
    __isset_bitfield = other.__isset_bitfield;
    this.idsocio = other.idsocio;
    this.num_afiliado = other.num_afiliado;
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetNombre()) {
      this.nombre = other.nombre;
    }
    if (other.isSetApellido()) {
      this.apellido = other.apellido;
    }
    if (other.isSetDireccion()) {
      this.direccion = other.direccion;
    }
    if (other.isSetTelefono()) {
      this.telefono = other.telefono;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
  }

  public Socio deepCopy() {
    return new Socio(this);
  }

  @Override
  public void clear() {
    setIdsocioIsSet(false);
    this.idsocio = 0;
    setNum_afiliadoIsSet(false);
    this.num_afiliado = 0;
    this.user = null;
    this.nombre = null;
    this.apellido = null;
    this.direccion = null;
    this.telefono = null;
    this.email = null;
  }

  public int getIdsocio() {
    return this.idsocio;
  }

  public Socio setIdsocio(int idsocio) {
    this.idsocio = idsocio;
    setIdsocioIsSet(true);
    return this;
  }

  public void unsetIdsocio() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDSOCIO_ISSET_ID);
  }

  /** Returns true if field idsocio is set (has been assigned a value) and false otherwise */
  public boolean isSetIdsocio() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDSOCIO_ISSET_ID);
  }

  public void setIdsocioIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDSOCIO_ISSET_ID, value);
  }

  public int getNum_afiliado() {
    return this.num_afiliado;
  }

  public Socio setNum_afiliado(int num_afiliado) {
    this.num_afiliado = num_afiliado;
    setNum_afiliadoIsSet(true);
    return this;
  }

  public void unsetNum_afiliado() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NUM_AFILIADO_ISSET_ID);
  }

  /** Returns true if field num_afiliado is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_afiliado() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NUM_AFILIADO_ISSET_ID);
  }

  public void setNum_afiliadoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NUM_AFILIADO_ISSET_ID, value);
  }

  public java.lang.String getUser() {
    return this.user;
  }

  public Socio setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public java.lang.String getNombre() {
    return this.nombre;
  }

  public Socio setNombre(java.lang.String nombre) {
    this.nombre = nombre;
    return this;
  }

  public void unsetNombre() {
    this.nombre = null;
  }

  /** Returns true if field nombre is set (has been assigned a value) and false otherwise */
  public boolean isSetNombre() {
    return this.nombre != null;
  }

  public void setNombreIsSet(boolean value) {
    if (!value) {
      this.nombre = null;
    }
  }

  public java.lang.String getApellido() {
    return this.apellido;
  }

  public Socio setApellido(java.lang.String apellido) {
    this.apellido = apellido;
    return this;
  }

  public void unsetApellido() {
    this.apellido = null;
  }

  /** Returns true if field apellido is set (has been assigned a value) and false otherwise */
  public boolean isSetApellido() {
    return this.apellido != null;
  }

  public void setApellidoIsSet(boolean value) {
    if (!value) {
      this.apellido = null;
    }
  }

  public java.lang.String getDireccion() {
    return this.direccion;
  }

  public Socio setDireccion(java.lang.String direccion) {
    this.direccion = direccion;
    return this;
  }

  public void unsetDireccion() {
    this.direccion = null;
  }

  /** Returns true if field direccion is set (has been assigned a value) and false otherwise */
  public boolean isSetDireccion() {
    return this.direccion != null;
  }

  public void setDireccionIsSet(boolean value) {
    if (!value) {
      this.direccion = null;
    }
  }

  public java.lang.String getTelefono() {
    return this.telefono;
  }

  public Socio setTelefono(java.lang.String telefono) {
    this.telefono = telefono;
    return this;
  }

  public void unsetTelefono() {
    this.telefono = null;
  }

  /** Returns true if field telefono is set (has been assigned a value) and false otherwise */
  public boolean isSetTelefono() {
    return this.telefono != null;
  }

  public void setTelefonoIsSet(boolean value) {
    if (!value) {
      this.telefono = null;
    }
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public Socio setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case IDSOCIO:
      if (value == null) {
        unsetIdsocio();
      } else {
        setIdsocio((java.lang.Integer)value);
      }
      break;

    case NUM_AFILIADO:
      if (value == null) {
        unsetNum_afiliado();
      } else {
        setNum_afiliado((java.lang.Integer)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case NOMBRE:
      if (value == null) {
        unsetNombre();
      } else {
        setNombre((java.lang.String)value);
      }
      break;

    case APELLIDO:
      if (value == null) {
        unsetApellido();
      } else {
        setApellido((java.lang.String)value);
      }
      break;

    case DIRECCION:
      if (value == null) {
        unsetDireccion();
      } else {
        setDireccion((java.lang.String)value);
      }
      break;

    case TELEFONO:
      if (value == null) {
        unsetTelefono();
      } else {
        setTelefono((java.lang.String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IDSOCIO:
      return getIdsocio();

    case NUM_AFILIADO:
      return getNum_afiliado();

    case USER:
      return getUser();

    case NOMBRE:
      return getNombre();

    case APELLIDO:
      return getApellido();

    case DIRECCION:
      return getDireccion();

    case TELEFONO:
      return getTelefono();

    case EMAIL:
      return getEmail();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IDSOCIO:
      return isSetIdsocio();
    case NUM_AFILIADO:
      return isSetNum_afiliado();
    case USER:
      return isSetUser();
    case NOMBRE:
      return isSetNombre();
    case APELLIDO:
      return isSetApellido();
    case DIRECCION:
      return isSetDireccion();
    case TELEFONO:
      return isSetTelefono();
    case EMAIL:
      return isSetEmail();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Socio)
      return this.equals((Socio)that);
    return false;
  }

  public boolean equals(Socio that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_idsocio = true;
    boolean that_present_idsocio = true;
    if (this_present_idsocio || that_present_idsocio) {
      if (!(this_present_idsocio && that_present_idsocio))
        return false;
      if (this.idsocio != that.idsocio)
        return false;
    }

    boolean this_present_num_afiliado = true;
    boolean that_present_num_afiliado = true;
    if (this_present_num_afiliado || that_present_num_afiliado) {
      if (!(this_present_num_afiliado && that_present_num_afiliado))
        return false;
      if (this.num_afiliado != that.num_afiliado)
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_nombre = true && this.isSetNombre();
    boolean that_present_nombre = true && that.isSetNombre();
    if (this_present_nombre || that_present_nombre) {
      if (!(this_present_nombre && that_present_nombre))
        return false;
      if (!this.nombre.equals(that.nombre))
        return false;
    }

    boolean this_present_apellido = true && this.isSetApellido();
    boolean that_present_apellido = true && that.isSetApellido();
    if (this_present_apellido || that_present_apellido) {
      if (!(this_present_apellido && that_present_apellido))
        return false;
      if (!this.apellido.equals(that.apellido))
        return false;
    }

    boolean this_present_direccion = true && this.isSetDireccion();
    boolean that_present_direccion = true && that.isSetDireccion();
    if (this_present_direccion || that_present_direccion) {
      if (!(this_present_direccion && that_present_direccion))
        return false;
      if (!this.direccion.equals(that.direccion))
        return false;
    }

    boolean this_present_telefono = true && this.isSetTelefono();
    boolean that_present_telefono = true && that.isSetTelefono();
    if (this_present_telefono || that_present_telefono) {
      if (!(this_present_telefono && that_present_telefono))
        return false;
      if (!this.telefono.equals(that.telefono))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + idsocio;

    hashCode = hashCode * 8191 + num_afiliado;

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetNombre()) ? 131071 : 524287);
    if (isSetNombre())
      hashCode = hashCode * 8191 + nombre.hashCode();

    hashCode = hashCode * 8191 + ((isSetApellido()) ? 131071 : 524287);
    if (isSetApellido())
      hashCode = hashCode * 8191 + apellido.hashCode();

    hashCode = hashCode * 8191 + ((isSetDireccion()) ? 131071 : 524287);
    if (isSetDireccion())
      hashCode = hashCode * 8191 + direccion.hashCode();

    hashCode = hashCode * 8191 + ((isSetTelefono()) ? 131071 : 524287);
    if (isSetTelefono())
      hashCode = hashCode * 8191 + telefono.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + email.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Socio other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIdsocio()).compareTo(other.isSetIdsocio());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdsocio()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.idsocio, other.idsocio);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNum_afiliado()).compareTo(other.isSetNum_afiliado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_afiliado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_afiliado, other.num_afiliado);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUser()).compareTo(other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNombre()).compareTo(other.isSetNombre());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNombre()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nombre, other.nombre);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApellido()).compareTo(other.isSetApellido());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApellido()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.apellido, other.apellido);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDireccion()).compareTo(other.isSetDireccion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDireccion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direccion, other.direccion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTelefono()).compareTo(other.isSetTelefono());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTelefono()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.telefono, other.telefono);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Socio(");
    boolean first = true;

    sb.append("idsocio:");
    sb.append(this.idsocio);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_afiliado:");
    sb.append(this.num_afiliado);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nombre:");
    if (this.nombre == null) {
      sb.append("null");
    } else {
      sb.append(this.nombre);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("apellido:");
    if (this.apellido == null) {
      sb.append("null");
    } else {
      sb.append(this.apellido);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("direccion:");
    if (this.direccion == null) {
      sb.append("null");
    } else {
      sb.append(this.direccion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("telefono:");
    if (this.telefono == null) {
      sb.append("null");
    } else {
      sb.append(this.telefono);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'num_afiliado' because it's a primitive and you chose the non-beans generator.
    if (user == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' was not present! Struct: " + toString());
    }
    if (nombre == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nombre' was not present! Struct: " + toString());
    }
    if (apellido == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'apellido' was not present! Struct: " + toString());
    }
    if (direccion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'direccion' was not present! Struct: " + toString());
    }
    if (telefono == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'telefono' was not present! Struct: " + toString());
    }
    if (email == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'email' was not present! Struct: " + toString());
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

  private static class SocioStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SocioStandardScheme getScheme() {
      return new SocioStandardScheme();
    }
  }

  private static class SocioStandardScheme extends org.apache.thrift.scheme.StandardScheme<Socio> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Socio struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDSOCIO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.idsocio = iprot.readI32();
              struct.setIdsocioIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_AFILIADO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.num_afiliado = iprot.readI32();
              struct.setNum_afiliadoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NOMBRE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nombre = iprot.readString();
              struct.setNombreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APELLIDO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.apellido = iprot.readString();
              struct.setApellidoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DIRECCION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.direccion = iprot.readString();
              struct.setDireccionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TELEFONO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.telefono = iprot.readString();
              struct.setTelefonoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
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
      if (!struct.isSetNum_afiliado()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'num_afiliado' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Socio struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IDSOCIO_FIELD_DESC);
      oprot.writeI32(struct.idsocio);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_AFILIADO_FIELD_DESC);
      oprot.writeI32(struct.num_afiliado);
      oprot.writeFieldEnd();
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      if (struct.nombre != null) {
        oprot.writeFieldBegin(NOMBRE_FIELD_DESC);
        oprot.writeString(struct.nombre);
        oprot.writeFieldEnd();
      }
      if (struct.apellido != null) {
        oprot.writeFieldBegin(APELLIDO_FIELD_DESC);
        oprot.writeString(struct.apellido);
        oprot.writeFieldEnd();
      }
      if (struct.direccion != null) {
        oprot.writeFieldBegin(DIRECCION_FIELD_DESC);
        oprot.writeString(struct.direccion);
        oprot.writeFieldEnd();
      }
      if (struct.telefono != null) {
        oprot.writeFieldBegin(TELEFONO_FIELD_DESC);
        oprot.writeString(struct.telefono);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SocioTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SocioTupleScheme getScheme() {
      return new SocioTupleScheme();
    }
  }

  private static class SocioTupleScheme extends org.apache.thrift.scheme.TupleScheme<Socio> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Socio struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.num_afiliado);
      oprot.writeString(struct.user);
      oprot.writeString(struct.nombre);
      oprot.writeString(struct.apellido);
      oprot.writeString(struct.direccion);
      oprot.writeString(struct.telefono);
      oprot.writeString(struct.email);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIdsocio()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIdsocio()) {
        oprot.writeI32(struct.idsocio);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Socio struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.num_afiliado = iprot.readI32();
      struct.setNum_afiliadoIsSet(true);
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.nombre = iprot.readString();
      struct.setNombreIsSet(true);
      struct.apellido = iprot.readString();
      struct.setApellidoIsSet(true);
      struct.direccion = iprot.readString();
      struct.setDireccionIsSet(true);
      struct.telefono = iprot.readString();
      struct.setTelefonoIsSet(true);
      struct.email = iprot.readString();
      struct.setEmailIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.idsocio = iprot.readI32();
        struct.setIdsocioIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


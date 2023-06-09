// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buffy.proto

public final class BuffyOuterClass {
  private BuffyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuffyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Buffy)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string thing = 1;</code>
     * @return Whether the thing field is set.
     */
    boolean hasThing();
    /**
     * <code>required string thing = 1;</code>
     * @return The thing.
     */
    java.lang.String getThing();
    /**
     * <code>required string thing = 1;</code>
     * @return The bytes for thing.
     */
    com.google.protobuf.ByteString
        getThingBytes();
  }
  /**
   * Protobuf type {@code Buffy}
   */
  public static final class Buffy extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Buffy)
      BuffyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Buffy.newBuilder() to construct.
    private Buffy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Buffy() {
      thing_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Buffy();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BuffyOuterClass.internal_static_Buffy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BuffyOuterClass.internal_static_Buffy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BuffyOuterClass.Buffy.class, BuffyOuterClass.Buffy.Builder.class);
    }

    private int bitField0_;
    public static final int THING_FIELD_NUMBER = 1;
    private volatile java.lang.Object thing_;
    /**
     * <code>required string thing = 1;</code>
     * @return Whether the thing field is set.
     */
    @java.lang.Override
    public boolean hasThing() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string thing = 1;</code>
     * @return The thing.
     */
    @java.lang.Override
    public java.lang.String getThing() {
      java.lang.Object ref = thing_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          thing_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string thing = 1;</code>
     * @return The bytes for thing.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getThingBytes() {
      java.lang.Object ref = thing_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        thing_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasThing()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, thing_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, thing_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof BuffyOuterClass.Buffy)) {
        return super.equals(obj);
      }
      BuffyOuterClass.Buffy other = (BuffyOuterClass.Buffy) obj;

      if (hasThing() != other.hasThing()) return false;
      if (hasThing()) {
        if (!getThing()
            .equals(other.getThing())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasThing()) {
        hash = (37 * hash) + THING_FIELD_NUMBER;
        hash = (53 * hash) + getThing().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BuffyOuterClass.Buffy parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuffyOuterClass.Buffy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BuffyOuterClass.Buffy parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static BuffyOuterClass.Buffy parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static BuffyOuterClass.Buffy parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static BuffyOuterClass.Buffy parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(BuffyOuterClass.Buffy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Buffy}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Buffy)
        BuffyOuterClass.BuffyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BuffyOuterClass.internal_static_Buffy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BuffyOuterClass.internal_static_Buffy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BuffyOuterClass.Buffy.class, BuffyOuterClass.Buffy.Builder.class);
      }

      // Construct using BuffyOuterClass.Buffy.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        thing_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BuffyOuterClass.internal_static_Buffy_descriptor;
      }

      @java.lang.Override
      public BuffyOuterClass.Buffy getDefaultInstanceForType() {
        return BuffyOuterClass.Buffy.getDefaultInstance();
      }

      @java.lang.Override
      public BuffyOuterClass.Buffy build() {
        BuffyOuterClass.Buffy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public BuffyOuterClass.Buffy buildPartial() {
        BuffyOuterClass.Buffy result = new BuffyOuterClass.Buffy(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.thing_ = thing_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BuffyOuterClass.Buffy) {
          return mergeFrom((BuffyOuterClass.Buffy)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BuffyOuterClass.Buffy other) {
        if (other == BuffyOuterClass.Buffy.getDefaultInstance()) return this;
        if (other.hasThing()) {
          bitField0_ |= 0x00000001;
          thing_ = other.thing_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasThing()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                thing_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object thing_ = "";
      /**
       * <code>required string thing = 1;</code>
       * @return Whether the thing field is set.
       */
      public boolean hasThing() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string thing = 1;</code>
       * @return The thing.
       */
      public java.lang.String getThing() {
        java.lang.Object ref = thing_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            thing_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string thing = 1;</code>
       * @return The bytes for thing.
       */
      public com.google.protobuf.ByteString
          getThingBytes() {
        java.lang.Object ref = thing_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          thing_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string thing = 1;</code>
       * @param value The thing to set.
       * @return This builder for chaining.
       */
      public Builder setThing(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        thing_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string thing = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearThing() {
        bitField0_ = (bitField0_ & ~0x00000001);
        thing_ = getDefaultInstance().getThing();
        onChanged();
        return this;
      }
      /**
       * <code>required string thing = 1;</code>
       * @param value The bytes for thing to set.
       * @return This builder for chaining.
       */
      public Builder setThingBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        thing_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Buffy)
    }

    // @@protoc_insertion_point(class_scope:Buffy)
    private static final BuffyOuterClass.Buffy DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BuffyOuterClass.Buffy();
    }

    public static BuffyOuterClass.Buffy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Buffy>
        PARSER = new com.google.protobuf.AbstractParser<Buffy>() {
      @java.lang.Override
      public Buffy parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Buffy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Buffy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public BuffyOuterClass.Buffy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Buffy_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Buffy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013buffy.proto\"\026\n\005Buffy\022\r\n\005thing\030\001 \002(\t"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Buffy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Buffy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Buffy_descriptor,
        new java.lang.String[] { "Thing", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

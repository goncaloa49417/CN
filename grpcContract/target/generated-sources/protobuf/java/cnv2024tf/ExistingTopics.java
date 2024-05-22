// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServiceContract.proto

package cnv2024tf;

/**
 * Protobuf type {@code cnv2024tf.ExistingTopics}
 */
public final class ExistingTopics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cnv2024tf.ExistingTopics)
    ExistingTopicsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExistingTopics.newBuilder() to construct.
  private ExistingTopics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExistingTopics() {
    topicName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExistingTopics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cnv2024tf.ServiceContract.internal_static_cnv2024tf_ExistingTopics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cnv2024tf.ServiceContract.internal_static_cnv2024tf_ExistingTopics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cnv2024tf.ExistingTopics.class, cnv2024tf.ExistingTopics.Builder.class);
  }

  public static final int TOPICNAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList topicName_;
  /**
   * <pre>
   * list of topic names
   * </pre>
   *
   * <code>repeated string topicName = 1;</code>
   * @return A list containing the topicName.
   */
  public com.google.protobuf.ProtocolStringList
      getTopicNameList() {
    return topicName_;
  }
  /**
   * <pre>
   * list of topic names
   * </pre>
   *
   * <code>repeated string topicName = 1;</code>
   * @return The count of topicName.
   */
  public int getTopicNameCount() {
    return topicName_.size();
  }
  /**
   * <pre>
   * list of topic names
   * </pre>
   *
   * <code>repeated string topicName = 1;</code>
   * @param index The index of the element to return.
   * @return The topicName at the given index.
   */
  public java.lang.String getTopicName(int index) {
    return topicName_.get(index);
  }
  /**
   * <pre>
   * list of topic names
   * </pre>
   *
   * <code>repeated string topicName = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the topicName at the given index.
   */
  public com.google.protobuf.ByteString
      getTopicNameBytes(int index) {
    return topicName_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < topicName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicName_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < topicName_.size(); i++) {
        dataSize += computeStringSizeNoTag(topicName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTopicNameList().size();
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
    if (!(obj instanceof cnv2024tf.ExistingTopics)) {
      return super.equals(obj);
    }
    cnv2024tf.ExistingTopics other = (cnv2024tf.ExistingTopics) obj;

    if (!getTopicNameList()
        .equals(other.getTopicNameList())) return false;
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
    if (getTopicNameCount() > 0) {
      hash = (37 * hash) + TOPICNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTopicNameList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cnv2024tf.ExistingTopics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cnv2024tf.ExistingTopics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cnv2024tf.ExistingTopics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cnv2024tf.ExistingTopics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cnv2024tf.ExistingTopics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cnv2024tf.ExistingTopics parseFrom(
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
  public static Builder newBuilder(cnv2024tf.ExistingTopics prototype) {
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
   * Protobuf type {@code cnv2024tf.ExistingTopics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cnv2024tf.ExistingTopics)
      cnv2024tf.ExistingTopicsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cnv2024tf.ServiceContract.internal_static_cnv2024tf_ExistingTopics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cnv2024tf.ServiceContract.internal_static_cnv2024tf_ExistingTopics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cnv2024tf.ExistingTopics.class, cnv2024tf.ExistingTopics.Builder.class);
    }

    // Construct using cnv2024tf.ExistingTopics.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      topicName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cnv2024tf.ServiceContract.internal_static_cnv2024tf_ExistingTopics_descriptor;
    }

    @java.lang.Override
    public cnv2024tf.ExistingTopics getDefaultInstanceForType() {
      return cnv2024tf.ExistingTopics.getDefaultInstance();
    }

    @java.lang.Override
    public cnv2024tf.ExistingTopics build() {
      cnv2024tf.ExistingTopics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cnv2024tf.ExistingTopics buildPartial() {
      cnv2024tf.ExistingTopics result = new cnv2024tf.ExistingTopics(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        topicName_ = topicName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.topicName_ = topicName_;
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
      if (other instanceof cnv2024tf.ExistingTopics) {
        return mergeFrom((cnv2024tf.ExistingTopics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cnv2024tf.ExistingTopics other) {
      if (other == cnv2024tf.ExistingTopics.getDefaultInstance()) return this;
      if (!other.topicName_.isEmpty()) {
        if (topicName_.isEmpty()) {
          topicName_ = other.topicName_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTopicNameIsMutable();
          topicName_.addAll(other.topicName_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureTopicNameIsMutable();
              topicName_.add(s);
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

    private com.google.protobuf.LazyStringList topicName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTopicNameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        topicName_ = new com.google.protobuf.LazyStringArrayList(topicName_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @return A list containing the topicName.
     */
    public com.google.protobuf.ProtocolStringList
        getTopicNameList() {
      return topicName_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @return The count of topicName.
     */
    public int getTopicNameCount() {
      return topicName_.size();
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param index The index of the element to return.
     * @return The topicName at the given index.
     */
    public java.lang.String getTopicName(int index) {
      return topicName_.get(index);
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the topicName at the given index.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes(int index) {
      return topicName_.getByteString(index);
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param index The index to set the value at.
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNameIsMutable();
      topicName_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param value The topicName to add.
     * @return This builder for chaining.
     */
    public Builder addTopicName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTopicNameIsMutable();
      topicName_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param values The topicName to add.
     * @return This builder for chaining.
     */
    public Builder addAllTopicName(
        java.lang.Iterable<java.lang.String> values) {
      ensureTopicNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, topicName_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of topic names
     * </pre>
     *
     * <code>repeated string topicName = 1;</code>
     * @param value The bytes of the topicName to add.
     * @return This builder for chaining.
     */
    public Builder addTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTopicNameIsMutable();
      topicName_.add(value);
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


    // @@protoc_insertion_point(builder_scope:cnv2024tf.ExistingTopics)
  }

  // @@protoc_insertion_point(class_scope:cnv2024tf.ExistingTopics)
  private static final cnv2024tf.ExistingTopics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cnv2024tf.ExistingTopics();
  }

  public static cnv2024tf.ExistingTopics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExistingTopics>
      PARSER = new com.google.protobuf.AbstractParser<ExistingTopics>() {
    @java.lang.Override
    public ExistingTopics parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExistingTopics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExistingTopics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cnv2024tf.ExistingTopics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


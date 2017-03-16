// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface ListTablesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListTablesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the instance for which tables should be listed.
   * Values are of the form projects/&lt;project&gt;/instances/&lt;instance&gt;
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The unique name of the instance for which tables should be listed.
   * Values are of the form projects/&lt;project&gt;/instances/&lt;instance&gt;
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Defaults to NAME_ONLY if unspecified (no others are currently supported).
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  int getViewValue();
  /**
   * <pre>
   * The view to be applied to the returned tables' fields.
   * Defaults to NAME_ONLY if unspecified (no others are currently supported).
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table.View view = 2;</code>
   */
  com.google.bigtable.admin.v2.Table.View getView();

  /**
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

public final class TriggerProto {
  private TriggerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Trigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_EventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Destination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Destination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Transport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_CloudRun_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_Pubsub_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Pubsub_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/eventarc/v1/trigger.proto"
          + "\022\030google.cloud.eventarc.v1\032\034google/api/a"
          + "nnotations.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\"\235\005\n\007Trigge"
          + "r\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\020\n\003uid\030\002 \001(\tB\003\340A\003\0224"
          + "\n\013create_time\030\005 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\022D\n\revent_filt"
          + "ers\030\010 \003(\0132%.google.cloud.eventarc.v1.Eve"
          + "ntFilterB\006\340A\006\340A\002\022B\n\017service_account\030\t \001("
          + "\tB)\340A\001\372A#\n!iam.googleapis.com/ServiceAcc"
          + "ount\022?\n\013destination\030\n \001(\0132%.google.cloud"
          + ".eventarc.v1.DestinationB\003\340A\002\022;\n\ttranspo"
          + "rt\030\013 \001(\0132#.google.cloud.eventarc.v1.Tran"
          + "sportB\003\340A\001\022B\n\006labels\030\014 \003(\0132-.google.clou"
          + "d.eventarc.v1.Trigger.LabelsEntryB\003\340A\001\022\021"
          + "\n\004etag\030c \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:s\352Ap\n\037eventarc."
          + "googleapis.com/Trigger\022:projects/{projec"
          + "t}/locations/{location}/triggers/{trigge"
          + "r}*\010triggers2\007trigger\"9\n\013EventFilter\022\026\n\t"
          + "attribute\030\001 \001(\tB\003\340A\002\022\022\n\005value\030\002 \001(\tB\003\340A\002"
          + "\"T\n\013Destination\0227\n\tcloud_run\030\001 \001(\0132\".goo"
          + "gle.cloud.eventarc.v1.CloudRunH\000B\014\n\ndesc"
          + "riptor\"O\n\tTransport\0222\n\006pubsub\030\001 \001(\0132 .go"
          + "ogle.cloud.eventarc.v1.PubsubH\000B\016\n\014inter"
          + "mediary\"g\n\010CloudRun\0223\n\007service\030\001 \001(\tB\"\340A"
          + "\002\372A\034\n\032run.googleapis.com/Service\022\021\n\004path"
          + "\030\002 \001(\tB\003\340A\001\022\023\n\006region\030\003 \001(\tB\003\340A\002\"7\n\006Pubs"
          + "ub\022\022\n\005topic\030\001 \001(\tB\003\340A\001\022\031\n\014subscription\030\002"
          + " \001(\tB\003\340A\003B\334\002\n\034com.google.cloud.eventarc."
          + "v1B\014TriggerProtoP\001Z@google.golang.org/ge"
          + "nproto/googleapis/cloud/eventarc/v1;even"
          + "tarc\352Ak\n+cloudfunctions.googleapis.com/C"
          + "loudFunction\022<projects/{project}/locatio"
          + "ns/{location}/functions/{function}\352AY\n!i"
          + "am.googleapis.com/ServiceAccount\0224projec"
          + "ts/{project}/serviceAccounts/{service_ac"
          + "count}\352A\037\n\032run.googleapis.com/Service\022\001*"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_v1_Trigger_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Trigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Trigger_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "EventFilters",
              "ServiceAccount",
              "Destination",
              "Transport",
              "Labels",
              "Etag",
            });
    internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor =
        internal_static_google_cloud_eventarc_v1_Trigger_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Trigger_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_eventarc_v1_EventFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_EventFilter_descriptor,
            new java.lang.String[] {
              "Attribute", "Value",
            });
    internal_static_google_cloud_eventarc_v1_Destination_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_eventarc_v1_Destination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Destination_descriptor,
            new java.lang.String[] {
              "CloudRun", "Descriptor",
            });
    internal_static_google_cloud_eventarc_v1_Transport_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Transport_descriptor,
            new java.lang.String[] {
              "Pubsub", "Intermediary",
            });
    internal_static_google_cloud_eventarc_v1_CloudRun_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_eventarc_v1_CloudRun_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_CloudRun_descriptor,
            new java.lang.String[] {
              "Service", "Path", "Region",
            });
    internal_static_google_cloud_eventarc_v1_Pubsub_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_eventarc_v1_Pubsub_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_Pubsub_descriptor,
            new java.lang.String[] {
              "Topic", "Subscription",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

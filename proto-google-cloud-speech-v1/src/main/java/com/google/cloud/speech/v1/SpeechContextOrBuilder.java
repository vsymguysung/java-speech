/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeechContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.util.List<java.lang.String> getPhrasesList();
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  int getPhrasesCount();
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  java.lang.String getPhrases(int index);
  /**
   *
   *
   * <pre>
   * A list of strings containing words and phrases "hints" so that
   * the speech recognition is more likely to recognize them. This can be used
   * to improve the accuracy for specific words and phrases, for example, if
   * specific commands are typically spoken by the user. This can also be used
   * to add additional words to the vocabulary of the recognizer. See
   * [usage limits](https://cloud.google.com/speech-to-text/quotas#content).
   * List items can also be set to classes for groups of words that represent
   * common concepts that occur in natural language. For example, rather than
   * providing phrase hints for every month of the year, using the $MONTH class
   * improves the likelihood of correctly transcribing audio that includes
   * months.
   * </pre>
   *
   * <code>repeated string phrases = 1;</code>
   */
  com.google.protobuf.ByteString getPhrasesBytes(int index);
}

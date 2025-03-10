package com.issa.kafka.master.enums;

public enum ServiceResultStatus {
    // general status
    DONE,
    ERROR,
    PENDING,
    NO_CLIENT_FOUND,


    // form, filter validation status
    FIELDS_REQUIRED,

    // connection status
    SERVER_NAME_DUPLICATE,
    SERVER_ID_DUPLICATE,
    CHECK_CONNECTION_PARAMS,
    NO_CONNECTION_FOUND,

    // topic status
    FAIL_TO_GET_TOPICS,
    FAIL_TO_GET_MESSAGE_COUNT,
    FAIL_TO_GET_MESSAGES,
    FAIL_TO_CREATE_TOPIC,
    TOPIC_NAME_LENGTH_IS_OVERFLOW,
    INVALID_PARTITION_COUNT,
    INVALID_REPLICA_COUNT,
    TOPIC_NAME_DUPLICATE,
    FAIL_TO_DELETE_TOPIC,
    TOPIC_NOT_FOUND,
    FAIL_TO_SEND_MESSAGE,



    // form filter status
    SERVER_NAME_LENGTH_OVERFLOWED,
    SERVER_IP_NOT_VALID,
    SERVER_PORT_NOT_VALID,
    FROM_DATE_INVALID,
    TO_DATE_INVALID,
    MESSAGE_NUMBERS_OVER_SIZED,



    // config status
    FAIL_TO_ADD_OR_EDIT_CONFIG,
    FAIL_TO_GET_CONFIGS,
    INVALID_CONFIG_KEY,
    INVALID_CONFIG_VALUE,
    FAIL_TO_DELETE_CONFIG,
    CONFIG_NOT_FOUND,

    // partition status
    FAIL_TO_GET_PARTITION_DETAIL,

    // consumer status
    FAIL_TO_GET_CONSUMERS,
    CONSUMER_GRP_NOT_FOUND,
    FAIL_TO_GET_CONSUMER_DETAIL,
    FAIL_TO_GET_CONSUMER_OFFSET,
    FAIL_TO_UPDATE_OFFSET,
    NO_UPDATE_NEEDED_FOR_OFFSET;
}

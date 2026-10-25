package io.realm.kotlin.internal.interop;

/* JADX INFO: loaded from: classes7.dex */
public class realmcJNI {
    public static final native int REALM_APP_SERVICES_get();

    public static final native long RLM_INVALID_CLASS_KEY_get();

    public static final native long RLM_INVALID_OBJECT_KEY_get();

    public static final native long RLM_INVALID_PROPERTY_KEY_get();

    public static final native long _realm_from_native_ptr(long j, long j2);

    public static final native void _realm_get_native_ptr(long j, long j2, long j3);

    public static final native long _realm_object_from_native_copy(long j, long j2);

    public static final native long _realm_object_from_native_move(long j, long j2);

    public static final native long _realm_object_get_native_ptr(long j);

    public static final native boolean after_client_reset(long j, long j2, long j3, boolean z);

    public static final native long apiKeyArray_getitem(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, int i);

    public static final native void apiKeyArray_setitem(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, int i, long j2, realm_app_user_apikey_t realm_app_user_apikey_tVar2);

    public static final native void app_apikey_callback(long j, long j2, realm_app_user_apikey_t realm_app_user_apikey_tVar, long j3, realm_app_error_t realm_app_error_tVar);

    public static final native void app_apikey_list_callback(long j, long j2, realm_app_user_apikey_t realm_app_user_apikey_tVar, long j3, long j4, realm_app_error_t realm_app_error_tVar);

    public static final native void app_complete_result_callback(long j, long j2, long j3, realm_app_error_t realm_app_error_tVar);

    public static final native void app_complete_void_callback(long j, long j2, realm_app_error_t realm_app_error_tVar);

    public static final native void app_string_callback(long j, String str, long j2, realm_app_error_t realm_app_error_tVar);

    public static final native boolean before_client_reset(long j, long j2);

    public static final native long classArray_getitem(long j, realm_class_info_t realm_class_info_tVar, int i);

    public static final native void classArray_setitem(long j, realm_class_info_t realm_class_info_tVar, int i, long j2, realm_class_info_t realm_class_info_tVar2);

    public static final native long collectionMoveArray_getitem(long j, realm_collection_move_t realm_collection_move_tVar, int i);

    public static final native void collectionMoveArray_setitem(long j, realm_collection_move_t realm_collection_move_tVar, int i, long j2, realm_collection_move_t realm_collection_move_tVar2);

    public static final native void complete_http_request(long j, Object obj);

    public static final native void delete_apiKeyArray(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar);

    public static final native void delete_classArray(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void delete_collectionMoveArray(long j, realm_collection_move_t realm_collection_move_tVar);

    public static final native void delete_identityArray(long j, realm_user_identity_t realm_user_identity_tVar);

    public static final native void delete_indexRangeArray(long j, realm_index_range_t realm_index_range_tVar);

    public static final native void delete_propertyArray(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void delete_propertyArrayArray(long j);

    public static final native void delete_queryArgArray(long j, realm_query_arg_t realm_query_arg_tVar);

    public static final native void delete_realm_app_error_t(long j);

    public static final native void delete_realm_app_user_apikey_t(long j);

    public static final native void delete_realm_binary_t(long j);

    public static final native void delete_realm_class_info_t(long j);

    public static final native void delete_realm_collection_move_t(long j);

    public static final native void delete_realm_decimal128_t(long j);

    public static final native void delete_realm_error_t(long j);

    public static final native void delete_realm_http_header_t(long j);

    public static final native void delete_realm_http_request_t(long j);

    public static final native void delete_realm_http_response_t(long j);

    public static final native void delete_realm_index_range_t(long j);

    public static final native void delete_realm_link_t(long j);

    public static final native void delete_realm_mongodb_find_one_and_modify_options_t(long j);

    public static final native void delete_realm_mongodb_find_options_t(long j);

    public static final native void delete_realm_object_id_t(long j);

    public static final native void delete_realm_property_info_t(long j);

    public static final native void delete_realm_query_arg_t(long j);

    public static final native void delete_realm_salted_file_ident_t(long j);

    public static final native void delete_realm_string_t(long j);

    public static final native void delete_realm_sync_error_compensating_write_info_t(long j);

    public static final native void delete_realm_sync_error_t(long j);

    public static final native void delete_realm_sync_error_user_info_t(long j);

    public static final native void delete_realm_timestamp_t(long j);

    public static final native void delete_realm_user_identity_t(long j);

    public static final native void delete_realm_uuid_t(long j);

    public static final native void delete_realm_value_t(long j);

    public static final native void delete_realm_version_id_t(long j);

    public static final native void delete_realm_websocket_endpoint_t(long j);

    public static final native void delete_valueArray(long j, realm_value_t realm_value_tVar);

    public static final native long identityArray_getitem(long j, realm_user_identity_t realm_user_identity_tVar, int i);

    public static final native void identityArray_setitem(long j, realm_user_identity_t realm_user_identity_tVar, int i, long j2, realm_user_identity_t realm_user_identity_tVar2);

    public static final native long indexRangeArray_getitem(long j, realm_index_range_t realm_index_range_tVar, int i);

    public static final native void indexRangeArray_setitem(long j, realm_index_range_t realm_index_range_tVar, int i, long j2, realm_index_range_t realm_index_range_tVar2);

    public static final native void invoke_core_notify_callback(long j);

    public static final native boolean migration_callback(long j, long j2, long j3, long j4);

    public static final native long new_apiKeyArray(int i);

    public static final native long new_classArray(int i);

    public static final native long new_collectionMoveArray(int i);

    public static final native long new_identityArray(int i);

    public static final native long new_indexRangeArray(int i);

    public static final native long new_propertyArray(int i);

    public static final native long new_propertyArrayArray(int i);

    public static final native long new_queryArgArray(int i);

    public static final native long new_realm_app_error_t();

    public static final native long new_realm_app_user_apikey_t();

    public static final native long new_realm_binary_t();

    public static final native long new_realm_class_info_t();

    public static final native long new_realm_collection_move_t();

    public static final native long new_realm_decimal128_t();

    public static final native long new_realm_error_t();

    public static final native long new_realm_http_header_t();

    public static final native long new_realm_http_request_t();

    public static final native long new_realm_http_response_t();

    public static final native long new_realm_index_range_t();

    public static final native long new_realm_link_t();

    public static final native long new_realm_mongodb_find_one_and_modify_options_t();

    public static final native long new_realm_mongodb_find_options_t();

    public static final native long new_realm_object_id_t();

    public static final native long new_realm_property_info_t();

    public static final native long new_realm_query_arg_t();

    public static final native long new_realm_salted_file_ident_t();

    public static final native long new_realm_string_t();

    public static final native long new_realm_sync_error_compensating_write_info_t();

    public static final native long new_realm_sync_error_t();

    public static final native long new_realm_sync_error_user_info_t();

    public static final native long new_realm_timestamp_t();

    public static final native long new_realm_user_identity_t();

    public static final native long new_realm_uuid_t();

    public static final native long new_realm_value_t();

    public static final native long new_realm_version_id_t();

    public static final native long new_realm_websocket_endpoint_t();

    public static final native long new_valueArray(int i);

    public static final native long propertyArrayArray_getitem(long j, int i);

    public static final native void propertyArrayArray_setitem(long j, int i, long j2, realm_property_info_t realm_property_info_tVar);

    public static final native long propertyArray_getitem(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native void propertyArray_setitem(long j, realm_property_info_t realm_property_info_tVar, int i, long j2, realm_property_info_t realm_property_info_tVar2);

    public static final native long queryArgArray_getitem(long j, realm_query_arg_t realm_query_arg_tVar, int i);

    public static final native void queryArgArray_setitem(long j, realm_query_arg_t realm_query_arg_tVar, int i, long j2, realm_query_arg_t realm_query_arg_tVar2);

    public static final native long realm_add_realm_changed_callback(long j, Object obj);

    public static final native long realm_add_realm_refresh_callback(long j, long j2, long j3, long j4);

    public static final native long realm_add_schema_changed_callback(long j, Object obj);

    public static final native boolean realm_app_call_function(long j, long j2, String str, String str2, String str3, Object obj);

    public static final native long realm_app_config_get_sync_client_config(long j);

    public static final native long realm_app_config_new(String str, long j);

    public static final native void realm_app_config_set_base_file_path(long j, String str);

    public static final native void realm_app_config_set_base_url(long j, String str);

    public static final native void realm_app_config_set_bundle_id(long j, String str);

    public static final native void realm_app_config_set_default_request_timeout(long j, long j2);

    public static final native void realm_app_config_set_device_name(long j, String str);

    public static final native void realm_app_config_set_device_version(long j, String str);

    public static final native void realm_app_config_set_framework_name(long j, String str);

    public static final native void realm_app_config_set_framework_version(long j, String str);

    public static final native void realm_app_config_set_metadata_encryption_key(long j, byte[] bArr);

    public static final native void realm_app_config_set_metadata_mode(long j, int i);

    public static final native void realm_app_config_set_platform_version(long j, String str);

    public static final native void realm_app_config_set_sdk(long j, String str);

    public static final native void realm_app_config_set_sdk_version(long j, String str);

    public static final native void realm_app_config_set_security_access_group(long j, String str);

    public static final native long realm_app_create(long j);

    public static final native long realm_app_create_cached(long j);

    public static final native long realm_app_credentials_new_anonymous(boolean z);

    public static final native long realm_app_credentials_new_api_key(String str);

    public static final native long realm_app_credentials_new_apple(String str);

    public static final native long realm_app_credentials_new_email_password(String str, String str2);

    public static final native long realm_app_credentials_new_facebook(String str);

    public static final native long realm_app_credentials_new_function(String str);

    public static final native long realm_app_credentials_new_google_auth_code(String str);

    public static final native long realm_app_credentials_new_google_id_token(String str);

    public static final native long realm_app_credentials_new_jwt(String str);

    public static final native String realm_app_credentials_serialize_as_json(long j);

    public static final native boolean realm_app_delete_user(long j, long j2, Object obj);

    public static final native boolean realm_app_email_password_provider_client_call_reset_password_function(long j, String str, String str2, String str3, Object obj);

    public static final native boolean realm_app_email_password_provider_client_confirm_user(long j, String str, String str2, Object obj);

    public static final native boolean realm_app_email_password_provider_client_register_email(long j, String str, String str2, Object obj);

    public static final native boolean realm_app_email_password_provider_client_resend_confirmation_email(long j, String str, Object obj);

    public static final native boolean realm_app_email_password_provider_client_reset_password(long j, String str, String str2, String str3, Object obj);

    public static final native boolean realm_app_email_password_provider_client_retry_custom_confirmation(long j, String str, Object obj);

    public static final native boolean realm_app_email_password_provider_client_send_reset_password_email(long j, String str, Object obj);

    public static final native long realm_app_error_t_categories_get(long j, realm_app_error_t realm_app_error_tVar);

    public static final native void realm_app_error_t_categories_set(long j, realm_app_error_t realm_app_error_tVar, long j2);

    public static final native int realm_app_error_t_error_get(long j, realm_app_error_t realm_app_error_tVar);

    public static final native void realm_app_error_t_error_set(long j, realm_app_error_t realm_app_error_tVar, int i);

    public static final native int realm_app_error_t_http_status_code_get(long j, realm_app_error_t realm_app_error_tVar);

    public static final native void realm_app_error_t_http_status_code_set(long j, realm_app_error_t realm_app_error_tVar, int i);

    public static final native String realm_app_error_t_link_to_server_logs_get(long j, realm_app_error_t realm_app_error_tVar);

    public static final native void realm_app_error_t_link_to_server_logs_set(long j, realm_app_error_t realm_app_error_tVar, String str);

    public static final native String realm_app_error_t_message_get(long j, realm_app_error_t realm_app_error_tVar);

    public static final native void realm_app_error_t_message_set(long j, realm_app_error_t realm_app_error_tVar, String str);

    public static final native boolean realm_app_get_all_users(long j, long[] jArr, long j2, long[] jArr2);

    public static final native String realm_app_get_app_id(long j);

    public static final native String realm_app_get_base_url(long j);

    public static final native boolean realm_app_get_cached(String str, String str2, long j);

    public static final native long realm_app_get_current_user(long j);

    public static final native String realm_app_get_default_base_url();

    public static final native boolean realm_app_link_user(long j, long j2, long j3, Object obj);

    public static final native boolean realm_app_log_in_with_credentials(long j, long j2, Object obj);

    public static final native boolean realm_app_log_out(long j, long j2, Object obj);

    public static final native boolean realm_app_log_out_current_user(long j, Object obj);

    public static final native boolean realm_app_push_notification_client_deregister_device(long j, long j2, String str, long j3, long j4, long j5);

    public static final native boolean realm_app_push_notification_client_register_device(long j, long j2, String str, String str2, long j3, long j4, long j5);

    public static final native boolean realm_app_refresh_custom_data(long j, long j2, Object obj);

    public static final native boolean realm_app_remove_user(long j, long j2, Object obj);

    public static final native boolean realm_app_switch_user(long j, long j2);

    public static final native String realm_app_sync_client_get_default_file_path_for_realm(long j, String str);

    public static final native boolean realm_app_sync_client_has_sessions(long j);

    public static final native void realm_app_sync_client_reconnect(long j);

    public static final native void realm_app_sync_client_wait_for_sessions_to_terminate(long j);

    public static final native boolean realm_app_update_base_url(long j, String str, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_create_apikey(long j, long j2, String str, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_delete_apikey(long j, long j2, long j3, realm_object_id_t realm_object_id_tVar, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_disable_apikey(long j, long j2, long j3, realm_object_id_t realm_object_id_tVar, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_enable_apikey(long j, long j2, long j3, realm_object_id_t realm_object_id_tVar, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_fetch_apikey(long j, long j2, long j3, realm_object_id_t realm_object_id_tVar, Object obj);

    public static final native boolean realm_app_user_apikey_provider_client_fetch_apikeys(long j, long j2, Object obj);

    public static final native boolean realm_app_user_apikey_t_disabled_get(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar);

    public static final native void realm_app_user_apikey_t_disabled_set(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, boolean z);

    public static final native long realm_app_user_apikey_t_id_get(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar);

    public static final native void realm_app_user_apikey_t_id_set(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, long j2, realm_object_id_t realm_object_id_tVar);

    public static final native String realm_app_user_apikey_t_key_get(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar);

    public static final native void realm_app_user_apikey_t_key_set(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, String str);

    public static final native String realm_app_user_apikey_t_name_get(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar);

    public static final native void realm_app_user_apikey_t_name_set(long j, realm_app_user_apikey_t realm_app_user_apikey_tVar, String str);

    public static final native boolean realm_async_begin_write(long j, long j2, long j3, long j4, boolean z, long j5);

    public static final native boolean realm_async_cancel(long j, long j2, long j3);

    public static final native boolean realm_async_commit(long j, long j2, long j3, long j4, boolean z, long j5);

    public static final native void realm_async_open_task_callback(long j, long j2, long j3);

    public static final native void realm_async_open_task_cancel(long j);

    public static final native long realm_async_open_task_register_download_progress_notifier(long j, long j2, long j3, long j4);

    public static final native void realm_async_open_task_start(long j, Object obj);

    public static final native int realm_auth_credentials_get_provider(long j);

    public static final native boolean realm_begin_read(long j);

    public static final native boolean realm_begin_write(long j);

    public static final native byte[] realm_binary_t_data_get(long j, realm_binary_t realm_binary_tVar);

    public static final native void realm_binary_t_data_set(long j, realm_binary_t realm_binary_tVar, byte[] bArr);

    public static final native long realm_binary_t_size_get(long j, realm_binary_t realm_binary_tVar);

    public static final native void realm_binary_t_size_set(long j, realm_binary_t realm_binary_tVar, long j2);

    public static final native void realm_changed_callback(long j);

    public static final native void realm_class_info_t_cleanup(long j, realm_class_info_t realm_class_info_tVar);

    public static final native int realm_class_info_t_flags_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_flags_set(long j, realm_class_info_t realm_class_info_tVar, int i);

    public static final native long realm_class_info_t_key_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_key_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native String realm_class_info_t_name_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_name_set(long j, realm_class_info_t realm_class_info_tVar, String str);

    public static final native long realm_class_info_t_num_computed_properties_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_num_computed_properties_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native long realm_class_info_t_num_properties_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_num_properties_set(long j, realm_class_info_t realm_class_info_tVar, long j2);

    public static final native String realm_class_info_t_primary_key_get(long j, realm_class_info_t realm_class_info_tVar);

    public static final native void realm_class_info_t_primary_key_set(long j, realm_class_info_t realm_class_info_tVar, String str);

    public static final native void realm_clear_cached_apps();

    public static final native boolean realm_clear_last_error();

    public static final native long realm_clone(long j);

    public static final native boolean realm_close(long j);

    public static final native void realm_collection_changes_get_changes(long j, long[] jArr, long j2, long[] jArr2, long j3, long[] jArr3, long j4, long[] jArr4, long j5, long j6, realm_collection_move_t realm_collection_move_tVar, long j7);

    public static final native void realm_collection_changes_get_num_changes(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, boolean[] zArr, boolean[] zArr2);

    public static final native void realm_collection_changes_get_num_ranges(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4);

    public static final native void realm_collection_changes_get_ranges(long j, long j2, realm_index_range_t realm_index_range_tVar, long j3, long j4, realm_index_range_t realm_index_range_tVar2, long j5, long j6, realm_index_range_t realm_index_range_tVar3, long j7, long j8, realm_index_range_t realm_index_range_tVar4, long j9, long j10, realm_collection_move_t realm_collection_move_tVar, long j11);

    public static final native long realm_collection_move_t_from_get(long j, realm_collection_move_t realm_collection_move_tVar);

    public static final native void realm_collection_move_t_from_set(long j, realm_collection_move_t realm_collection_move_tVar, long j2);

    public static final native long realm_collection_move_t_to_get(long j, realm_collection_move_t realm_collection_move_tVar);

    public static final native void realm_collection_move_t_to_set(long j, realm_collection_move_t realm_collection_move_tVar, long j2);

    public static final native boolean realm_commit(long j);

    public static final native boolean realm_compact(long j, boolean[] zArr);

    public static final native boolean realm_config_get_automatic_change_notifications(long j);

    public static final native boolean realm_config_get_cached(long j);

    public static final native boolean realm_config_get_disable_format_upgrade(long j);

    public static final native long realm_config_get_encryption_key(long j, byte[] bArr);

    public static final native String realm_config_get_fifo_path(long j);

    public static final native boolean realm_config_get_force_sync_history(long j);

    public static final native boolean realm_config_get_in_memory(long j);

    public static final native long realm_config_get_max_number_of_active_versions(long j);

    public static final native String realm_config_get_path(long j);

    public static final native long realm_config_get_schema(long j);

    public static final native int realm_config_get_schema_mode(long j);

    public static final native int realm_config_get_schema_subset_mode(long j);

    public static final native long realm_config_get_schema_version(long j);

    public static final native boolean realm_config_needs_file_format_upgrade(long j);

    public static final native long realm_config_new();

    public static final native void realm_config_set_automatic_backlink_handling(long j, boolean z);

    public static final native void realm_config_set_automatic_change_notifications(long j, boolean z);

    public static final native void realm_config_set_cached(long j, boolean z);

    public static final native void realm_config_set_data_initialization_function(long j, Object obj);

    public static final native void realm_config_set_disable_format_upgrade(long j, boolean z);

    public static final native boolean realm_config_set_encryption_key(long j, byte[] bArr, long j2);

    public static final native void realm_config_set_fifo_path(long j, String str);

    public static final native void realm_config_set_force_sync_history(long j, boolean z);

    public static final native void realm_config_set_in_memory(long j, boolean z);

    public static final native void realm_config_set_max_number_of_active_versions(long j, long j2);

    public static final native void realm_config_set_migration_function(long j, Object obj);

    public static final native void realm_config_set_path(long j, String str);

    public static final native void realm_config_set_scheduler(long j, long j2);

    public static final native void realm_config_set_schema(long j, long j2);

    public static final native void realm_config_set_schema_mode(long j, int i);

    public static final native void realm_config_set_schema_subset_mode(long j, int i);

    public static final native void realm_config_set_schema_version(long j, long j2);

    public static final native void realm_config_set_should_compact_on_launch_function(long j, Object obj);

    public static final native void realm_config_set_sync_config(long j, long j2);

    public static final native boolean realm_convert_with_config(long j, long j2, boolean z);

    public static final native long realm_create_generic_scheduler();

    public static final native long realm_create_key_path_array(long j, long j2, long j3, String[] strArr);

    public static final native long realm_create_scheduler(Object obj);

    public static final native long realm_create_thread_safe_reference(long j);

    public static final native boolean realm_data_initialization_callback(long j, long j2);

    public static final native long[] realm_decimal128_t_w_get(long j, realm_decimal128_t realm_decimal128_tVar);

    public static final native void realm_decimal128_t_w_set(long j, realm_decimal128_t realm_decimal128_tVar, long[] jArr);

    public static final native boolean realm_delete_files(String str, boolean[] zArr);

    public static final native boolean realm_dictionary_clear(long j);

    public static final native boolean realm_dictionary_contains_key(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_dictionary_contains_value(long j, long j2, realm_value_t realm_value_tVar, long[] jArr);

    public static final native boolean realm_dictionary_erase(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_dictionary_find(long j, long j2, realm_value_t realm_value_tVar, long j3, realm_value_t realm_value_tVar2, boolean[] zArr);

    public static final native long realm_dictionary_from_thread_safe_reference(long j, long j2);

    public static final native boolean realm_dictionary_get(long j, long j2, long j3, realm_value_t realm_value_tVar, long j4, realm_value_t realm_value_tVar2);

    public static final native void realm_dictionary_get_changed_keys(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, long j3, realm_value_t realm_value_tVar2, long[] jArr2, long j4, realm_value_t realm_value_tVar3, long[] jArr3, boolean[] zArr);

    public static final native void realm_dictionary_get_changes(long j, long[] jArr, long[] jArr2, long[] jArr3, boolean[] zArr);

    public static final native long realm_dictionary_get_dictionary(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_get_keys(long j, long[] jArr, long[] jArr2);

    public static final native long realm_dictionary_get_linked_object(long j, long j2, realm_value_t realm_value_tVar);

    public static final native long realm_dictionary_get_list(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_get_property(long j, long j2, realm_property_info_t realm_property_info_tVar);

    public static final native boolean realm_dictionary_insert(long j, long j2, realm_value_t realm_value_tVar, long j3, realm_value_t realm_value_tVar2, long[] jArr, boolean[] zArr);

    public static final native long realm_dictionary_insert_dictionary(long j, long j2, realm_value_t realm_value_tVar);

    public static final native long realm_dictionary_insert_embedded(long j, long j2, realm_value_t realm_value_tVar);

    public static final native long realm_dictionary_insert_list(long j, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_dictionary_is_valid(long j);

    public static final native boolean realm_dictionary_resolve_in(long j, long j2, long j3);

    public static final native boolean realm_dictionary_size(long j, long[] jArr);

    public static final native long realm_dictionary_to_results(long j);

    public static final native boolean realm_equals(long j, long j2);

    public static final native long realm_error_t_categories_get(long j, realm_error_t realm_error_tVar);

    public static final native void realm_error_t_categories_set(long j, realm_error_t realm_error_tVar, long j2);

    public static final native int realm_error_t_error_get(long j, realm_error_t realm_error_tVar);

    public static final native void realm_error_t_error_set(long j, realm_error_t realm_error_tVar, int i);

    public static final native String realm_error_t_message_get(long j, realm_error_t realm_error_tVar);

    public static final native void realm_error_t_message_set(long j, realm_error_t realm_error_tVar, String str);

    public static final native String realm_error_t_path_get(long j, realm_error_t realm_error_tVar);

    public static final native void realm_error_t_path_set(long j, realm_error_t realm_error_tVar, String str);

    public static final native long realm_error_t_user_code_error_get(long j, realm_error_t realm_error_tVar);

    public static final native void realm_error_t_user_code_error_set(long j, realm_error_t realm_error_tVar, long j2);

    public static final native boolean realm_find_class(long j, String str, boolean[] zArr, long j2, realm_class_info_t realm_class_info_tVar);

    public static final native boolean realm_find_property(long j, long j2, String str, boolean[] zArr, long j3, realm_property_info_t realm_property_info_tVar);

    public static final native boolean realm_find_property_by_public_name(long j, long j2, String str, boolean[] zArr, long j3, realm_property_info_t realm_property_info_tVar);

    public static final native long realm_flx_sync_config_new(long j);

    public static final native void realm_free(long j);

    public static final native long realm_freeze(long j);

    public static final native long realm_from_thread_safe_reference(long j, long j2);

    public static final native boolean realm_get_async_error(long j, long j2, realm_error_t realm_error_tVar);

    public static final native long realm_get_backlinks(long j, long j2, long j3);

    public static final native long realm_get_category_names(long j, String[] strArr);

    public static final native boolean realm_get_class(long j, long j2, long j3, realm_class_info_t realm_class_info_tVar);

    public static final native boolean realm_get_class_keys(long j, long[] jArr, long j2, long[] jArr2);

    public static final native boolean realm_get_class_properties(long j, long j2, long j3, realm_property_info_t realm_property_info_tVar, long j4, long[] jArr);

    public static final native long realm_get_dictionary(long j, long j2);

    public static final native boolean realm_get_last_error(long j, realm_error_t realm_error_tVar);

    public static final native long realm_get_last_error_as_async_error();

    public static final native String realm_get_library_version();

    public static final native void realm_get_library_version_numbers(long j, long j2, long j3, String[] strArr);

    public static final native long realm_get_linked_object(long j, long j2);

    public static final native long realm_get_list(long j, long j2);

    public static final native Object[] realm_get_log_category_names();

    public static final native int realm_get_log_level_category(String str);

    public static final native long realm_get_num_classes(long j);

    public static final native boolean realm_get_num_objects(long j, long j2, long[] jArr);

    public static final native boolean realm_get_num_versions(long j, long[] jArr);

    public static final native long realm_get_object(long j, long j2, long j3);

    public static final native long realm_get_persisted_schema_version(long j);

    public static final native boolean realm_get_property(long j, long j2, long j3, long j4, realm_property_info_t realm_property_info_tVar);

    public static final native boolean realm_get_property_keys(long j, long j2, long[] jArr, long j3, long[] jArr2);

    public static final native long realm_get_schema(long j);

    public static final native long realm_get_schema_version(long j);

    public static final native long realm_get_set(long j, long j2);

    public static final native boolean realm_get_value(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_get_value_by_property_index(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_get_version_id(long j, boolean[] zArr, long j2, realm_version_id_t realm_version_id_tVar);

    public static final native String realm_http_header_t_name_get(long j, realm_http_header_t realm_http_header_tVar);

    public static final native void realm_http_header_t_name_set(long j, realm_http_header_t realm_http_header_tVar, String str);

    public static final native String realm_http_header_t_value_get(long j, realm_http_header_t realm_http_header_tVar);

    public static final native void realm_http_header_t_value_set(long j, realm_http_header_t realm_http_header_tVar, String str);

    public static final native String realm_http_request_t_body_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_body_set(long j, realm_http_request_t realm_http_request_tVar, String str);

    public static final native long realm_http_request_t_body_size_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_body_size_set(long j, realm_http_request_t realm_http_request_tVar, long j2);

    public static final native long realm_http_request_t_headers_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_headers_set(long j, realm_http_request_t realm_http_request_tVar, long j2, realm_http_header_t realm_http_header_tVar);

    public static final native int realm_http_request_t_method_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_method_set(long j, realm_http_request_t realm_http_request_tVar, int i);

    public static final native long realm_http_request_t_num_headers_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_num_headers_set(long j, realm_http_request_t realm_http_request_tVar, long j2);

    public static final native long realm_http_request_t_timeout_ms_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_timeout_ms_set(long j, realm_http_request_t realm_http_request_tVar, long j2);

    public static final native String realm_http_request_t_url_get(long j, realm_http_request_t realm_http_request_tVar);

    public static final native void realm_http_request_t_url_set(long j, realm_http_request_t realm_http_request_tVar, String str);

    public static final native String realm_http_response_t_body_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_body_set(long j, realm_http_response_t realm_http_response_tVar, String str);

    public static final native long realm_http_response_t_body_size_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_body_size_set(long j, realm_http_response_t realm_http_response_tVar, long j2);

    public static final native int realm_http_response_t_custom_status_code_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_custom_status_code_set(long j, realm_http_response_t realm_http_response_tVar, int i);

    public static final native long realm_http_response_t_headers_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_headers_set(long j, realm_http_response_t realm_http_response_tVar, long j2, realm_http_header_t realm_http_header_tVar);

    public static final native long realm_http_response_t_num_headers_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_num_headers_set(long j, realm_http_response_t realm_http_response_tVar, long j2);

    public static final native int realm_http_response_t_status_code_get(long j, realm_http_response_t realm_http_response_tVar);

    public static final native void realm_http_response_t_status_code_set(long j, realm_http_response_t realm_http_response_tVar, int i);

    public static final native void realm_http_transport_complete_request(long j, long j2, realm_http_response_t realm_http_response_tVar);

    public static final native long realm_http_transport_new(long j, long j2, long j3);

    public static final native long realm_index_range_t_from_get(long j, realm_index_range_t realm_index_range_tVar);

    public static final native void realm_index_range_t_from_set(long j, realm_index_range_t realm_index_range_tVar, long j2);

    public static final native long realm_index_range_t_to_get(long j, realm_index_range_t realm_index_range_tVar);

    public static final native void realm_index_range_t_to_set(long j, realm_index_range_t realm_index_range_tVar, long j2);

    public static final native boolean realm_is_closed(long j);

    public static final native boolean realm_is_frozen(long j);

    public static final native boolean realm_is_writable(long j);

    public static final native long realm_link_t_target_get(long j, realm_link_t realm_link_tVar);

    public static final native void realm_link_t_target_set(long j, realm_link_t realm_link_tVar, long j2);

    public static final native long realm_link_t_target_table_get(long j, realm_link_t realm_link_tVar);

    public static final native void realm_link_t_target_table_set(long j, realm_link_t realm_link_tVar, long j2);

    public static final native boolean realm_list_clear(long j);

    public static final native boolean realm_list_erase(long j, long j2);

    public static final native boolean realm_list_find(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native long realm_list_from_thread_safe_reference(long j, long j2);

    public static final native boolean realm_list_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_get_dictionary(long j, long j2);

    public static final native long realm_list_get_linked_object(long j, long j2);

    public static final native long realm_list_get_list(long j, long j2);

    public static final native boolean realm_list_get_property(long j, long j2, realm_property_info_t realm_property_info_tVar);

    public static final native boolean realm_list_insert(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_insert_dictionary(long j, long j2);

    public static final native long realm_list_insert_embedded(long j, long j2);

    public static final native long realm_list_insert_list(long j, long j2);

    public static final native boolean realm_list_is_valid(long j);

    public static final native boolean realm_list_move(long j, long j2, long j3);

    public static final native boolean realm_list_remove_all(long j);

    public static final native boolean realm_list_resolve_in(long j, long j2, long[] jArr);

    public static final native boolean realm_list_set(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_list_set_dictionary(long j, long j2);

    public static final native long realm_list_set_embedded(long j, long j2);

    public static final native long realm_list_set_list(long j, long j2);

    public static final native boolean realm_list_size(long j, long[] jArr);

    public static final native long realm_list_to_results(long j);

    public static final native boolean realm_mongo_collection_aggregate(long j, String str, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_count(long j, String str, long j2, long j3, long j4, long j5);

    public static final native boolean realm_mongo_collection_delete_many(long j, String str, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_delete_one(long j, String str, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_find(long j, String str, long j2, realm_mongodb_find_options_t realm_mongodb_find_options_tVar, long j3, long j4, long j5);

    public static final native boolean realm_mongo_collection_find_one(long j, String str, long j2, realm_mongodb_find_options_t realm_mongodb_find_options_tVar, long j3, long j4, long j5);

    public static final native boolean realm_mongo_collection_find_one_and_delete(long j, String str, long j2, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, long j3, long j4, long j5);

    public static final native boolean realm_mongo_collection_find_one_and_replace(long j, String str, String str2, long j2, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, long j3, long j4, long j5);

    public static final native boolean realm_mongo_collection_find_one_and_update(long j, String str, String str2, long j2, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, long j3, long j4, long j5);

    public static final native long realm_mongo_collection_get(long j, String str, String str2, String str3);

    public static final native boolean realm_mongo_collection_insert_many(long j, String str, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_insert_one(long j, String str, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_update_many(long j, String str, String str2, boolean z, long j2, long j3, long j4);

    public static final native boolean realm_mongo_collection_update_one(long j, String str, String str2, boolean z, long j2, long j3, long j4);

    public static final native String realm_mongodb_find_one_and_modify_options_t_projection_bson_get(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar);

    public static final native void realm_mongodb_find_one_and_modify_options_t_projection_bson_set(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, String str);

    public static final native boolean realm_mongodb_find_one_and_modify_options_t_return_new_document_get(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar);

    public static final native void realm_mongodb_find_one_and_modify_options_t_return_new_document_set(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, boolean z);

    public static final native String realm_mongodb_find_one_and_modify_options_t_sort_bson_get(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar);

    public static final native void realm_mongodb_find_one_and_modify_options_t_sort_bson_set(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, String str);

    public static final native boolean realm_mongodb_find_one_and_modify_options_t_upsert_get(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar);

    public static final native void realm_mongodb_find_one_and_modify_options_t_upsert_set(long j, realm_mongodb_find_one_and_modify_options_t realm_mongodb_find_one_and_modify_options_tVar, boolean z);

    public static final native long realm_mongodb_find_options_t_limit_get(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar);

    public static final native void realm_mongodb_find_options_t_limit_set(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar, long j2);

    public static final native String realm_mongodb_find_options_t_projection_bson_get(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar);

    public static final native void realm_mongodb_find_options_t_projection_bson_set(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar, String str);

    public static final native String realm_mongodb_find_options_t_sort_bson_get(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar);

    public static final native void realm_mongodb_find_options_t_sort_bson_set(long j, realm_mongodb_find_options_t realm_mongodb_find_options_tVar, String str);

    public static final native long realm_network_transport_new(Object obj);

    public static final native boolean realm_object_add_int(long j, long j2, long j3);

    public static final native long realm_object_as_link(long j);

    public static final native long realm_object_changes_get_modified_properties(long j, long[] jArr, long j2);

    public static final native long realm_object_changes_get_num_modified_properties(long j);

    public static final native boolean realm_object_changes_is_deleted(long j);

    public static final native long realm_object_create(long j, long j2);

    public static final native long realm_object_create_with_primary_key(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_object_delete(long j);

    public static final native long realm_object_find_all(long j, long j2);

    public static final native long realm_object_find_with_primary_key(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native long realm_object_from_thread_safe_reference(long j, long j2);

    public static final native long realm_object_get_key(long j);

    public static final native long realm_object_get_or_create_with_primary_key(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_object_get_parent(long j, long[] jArr, long[] jArr2);

    public static final native long realm_object_get_table(long j);

    public static final native short[] realm_object_id_t_bytes_get(long j, realm_object_id_t realm_object_id_tVar);

    public static final native void realm_object_id_t_bytes_set(long j, realm_object_id_t realm_object_id_tVar, short[] sArr);

    public static final native boolean realm_object_is_valid(long j);

    public static final native boolean realm_object_resolve_in(long j, long j2, long[] jArr);

    public static final native String realm_object_to_string(long j);

    public static final native long realm_open(long j);

    public static final native long realm_open_synchronized(long j);

    public static final native void realm_property_info_t_cleanup(long j, realm_property_info_t realm_property_info_tVar);

    public static final native int realm_property_info_t_collection_type_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_collection_type_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native int realm_property_info_t_flags_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_flags_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native long realm_property_info_t_key_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_key_set(long j, realm_property_info_t realm_property_info_tVar, long j2);

    public static final native String realm_property_info_t_link_origin_property_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_link_origin_property_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_link_target_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_link_target_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native String realm_property_info_t_public_name_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_public_name_set(long j, realm_property_info_t realm_property_info_tVar, String str);

    public static final native int realm_property_info_t_type_get(long j, realm_property_info_t realm_property_info_tVar);

    public static final native void realm_property_info_t_type_set(long j, realm_property_info_t realm_property_info_tVar, int i);

    public static final native long realm_query_append_query(long j, String str, long j2, long j3, realm_query_arg_t realm_query_arg_tVar);

    public static final native long realm_query_arg_t_arg_get(long j, realm_query_arg_t realm_query_arg_tVar);

    public static final native void realm_query_arg_t_arg_set(long j, realm_query_arg_t realm_query_arg_tVar, long j2, realm_value_t realm_value_tVar);

    public static final native boolean realm_query_arg_t_is_list_get(long j, realm_query_arg_t realm_query_arg_tVar);

    public static final native void realm_query_arg_t_is_list_set(long j, realm_query_arg_t realm_query_arg_tVar, boolean z);

    public static final native long realm_query_arg_t_nb_args_get(long j, realm_query_arg_t realm_query_arg_tVar);

    public static final native void realm_query_arg_t_nb_args_set(long j, realm_query_arg_t realm_query_arg_tVar, long j2);

    public static final native boolean realm_query_count(long j, long[] jArr);

    public static final native long realm_query_find_all(long j);

    public static final native boolean realm_query_find_first(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native String realm_query_get_description(long j);

    public static final native long realm_query_parse(long j, long j2, String str, long j3, long j4, realm_query_arg_t realm_query_arg_tVar);

    public static final native long realm_query_parse_for_list(long j, String str, long j2, long j3, realm_query_arg_t realm_query_arg_tVar);

    public static final native long realm_query_parse_for_results(long j, String str, long j2, long j3, realm_query_arg_t realm_query_arg_tVar);

    public static final native long realm_query_parse_for_set(long j, String str, long j2, long j3, realm_query_arg_t realm_query_arg_tVar);

    public static final native boolean realm_refresh(long j, boolean[] zArr);

    public static final native void realm_register_user_code_callback_error(long j);

    public static final native void realm_release(long j);

    public static final native boolean realm_remove_table(long j, String str, long j2);

    public static final native boolean realm_results_average(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_results_count(long j, long[] jArr);

    public static final native boolean realm_results_delete_all(long j);

    public static final native long realm_results_distinct(long j, String str);

    public static final native long realm_results_filter(long j, long j2);

    public static final native boolean realm_results_find(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native boolean realm_results_find_object(long j, long j2, long[] jArr, boolean[] zArr);

    public static final native long realm_results_from_thread_safe_reference(long j, long j2);

    public static final native boolean realm_results_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native long realm_results_get_dictionary(long j, long j2);

    public static final native long realm_results_get_list(long j, long j2);

    public static final native long realm_results_get_object(long j, long j2);

    public static final native long realm_results_get_query(long j);

    public static final native boolean realm_results_is_valid(long j, long j2);

    public static final native long realm_results_limit(long j, long j2);

    public static final native boolean realm_results_max(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_results_min(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native long realm_results_resolve_in(long j, long j2);

    public static final native long realm_results_sort(long j, String str);

    public static final native boolean realm_results_sum(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_rollback(long j);

    public static final native long realm_salted_file_ident_t_ident_get(long j, realm_salted_file_ident_t realm_salted_file_ident_tVar);

    public static final native void realm_salted_file_ident_t_ident_set(long j, realm_salted_file_ident_t realm_salted_file_ident_tVar, long j2);

    public static final native long realm_salted_file_ident_t_salt_get(long j, realm_salted_file_ident_t realm_salted_file_ident_tVar);

    public static final native void realm_salted_file_ident_t_salt_set(long j, realm_salted_file_ident_t realm_salted_file_ident_tVar, long j2);

    public static final native long realm_scheduler_get_frozen();

    public static final native long realm_scheduler_make_default();

    public static final native long realm_scheduler_new(long j, long j2, long j3, long j4, long j5, long j6);

    public static final native void realm_scheduler_perform_work(long j);

    public static final native long realm_schema_new(long j, realm_class_info_t realm_class_info_tVar, long j2, long j3);

    public static final native boolean realm_schema_rename_property(long j, long j2, String str, String str2, String str3);

    public static final native boolean realm_schema_validate(long j, long j2);

    public static final native boolean realm_set_clear(long j);

    public static final native long realm_set_dictionary(long j, long j2);

    public static final native long realm_set_embedded(long j, long j2);

    public static final native boolean realm_set_erase(long j, long j2, realm_value_t realm_value_tVar, boolean[] zArr);

    public static final native boolean realm_set_find(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native long realm_set_from_thread_safe_reference(long j, long j2);

    public static final native boolean realm_set_get(long j, long j2, long j3, realm_value_t realm_value_tVar);

    public static final native boolean realm_set_get_property(long j, long j2, realm_property_info_t realm_property_info_tVar);

    public static final native boolean realm_set_insert(long j, long j2, realm_value_t realm_value_tVar, long[] jArr, boolean[] zArr);

    public static final native boolean realm_set_is_valid(long j);

    public static final native boolean realm_set_json(long j, long j2, String str);

    public static final native long realm_set_list(long j, long j2);

    public static final native void realm_set_log_callback(long j, long j2, long j3);

    public static final native void realm_set_log_level(int i);

    public static final native int realm_set_log_level_category(String str, int i);

    public static final native boolean realm_set_remove_all(long j);

    public static final native boolean realm_set_resolve_in(long j, long j2, long[] jArr);

    public static final native boolean realm_set_size(long j, long[] jArr);

    public static final native long realm_set_to_results(long j);

    public static final native boolean realm_set_value(long j, long j2, long j3, realm_value_t realm_value_tVar, boolean z);

    public static final native boolean realm_should_compact_callback(long j, long j2, long j3);

    public static final native String realm_string_t_data_get(long j, realm_string_t realm_string_tVar);

    public static final native void realm_string_t_data_set(long j, realm_string_t realm_string_tVar, String str);

    public static final native long realm_string_t_size_get(long j, realm_string_t realm_string_tVar);

    public static final native void realm_string_t_size_set(long j, realm_string_t realm_string_tVar, long j2);

    public static final native void realm_subscriptionset_changed_callback(long j, int i);

    public static final native void realm_sync_client_config_set_connect_timeout(long j, long j2);

    public static final native void realm_sync_client_config_set_connection_linger_time(long j, long j2);

    public static final native void realm_sync_client_config_set_default_binding_thread_observer(long j, Object obj);

    public static final native void realm_sync_client_config_set_fast_reconnect_limit(long j, long j2);

    public static final native void realm_sync_client_config_set_max_resumption_delay_interval(long j, long j2);

    public static final native void realm_sync_client_config_set_multiplex_sessions(long j, boolean z);

    public static final native void realm_sync_client_config_set_ping_keepalive_period(long j, long j2);

    public static final native void realm_sync_client_config_set_pong_keepalive_timeout(long j, long j2);

    public static final native void realm_sync_client_config_set_reconnect_mode(long j, int i);

    public static final native void realm_sync_client_config_set_resumption_delay_backoff_multiplier(long j, int i);

    public static final native void realm_sync_client_config_set_resumption_delay_interval(long j, long j2);

    public static final native void realm_sync_client_config_set_sync_socket(long j, long j2);

    public static final native void realm_sync_client_config_set_user_agent_application_info(long j, String str);

    public static final native void realm_sync_client_config_set_user_agent_binding_info(long j, String str);

    public static final native long realm_sync_config_new(long j, String str);

    public static final native void realm_sync_config_set_after_client_reset_handler(long j, long j2, long j3, long j4);

    public static final native void realm_sync_config_set_authorization_header_name(long j, String str);

    public static final native void realm_sync_config_set_before_client_reset_handler(long j, long j2, long j3, long j4);

    public static final native void realm_sync_config_set_cancel_waits_on_nonfatal_error(long j, boolean z);

    public static final native void realm_sync_config_set_client_validate_ssl(long j, boolean z);

    public static final native void realm_sync_config_set_custom_http_header(long j, String str, String str2);

    public static final native void realm_sync_config_set_error_handler(long j, long j2, long j3, long j4);

    public static final native void realm_sync_config_set_initial_subscription_handler(long j, long j2, boolean z, long j3, long j4);

    public static final native void realm_sync_config_set_recovery_directory_path(long j, String str);

    public static final native void realm_sync_config_set_resync_mode(long j, int i);

    public static final native void realm_sync_config_set_session_stop_policy(long j, int i);

    public static final native void realm_sync_config_set_ssl_trust_certificate_path(long j, String str);

    public static final native void realm_sync_config_set_ssl_verify_callback(long j, long j2, long j3, long j4);

    public static final native String realm_sync_error_compensating_write_info_t_object_name_get(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar);

    public static final native void realm_sync_error_compensating_write_info_t_object_name_set(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar, String str);

    public static final native long realm_sync_error_compensating_write_info_t_primary_key_get(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar);

    public static final native void realm_sync_error_compensating_write_info_t_primary_key_set(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar, long j2, realm_value_t realm_value_tVar);

    public static final native String realm_sync_error_compensating_write_info_t_reason_get(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar);

    public static final native void realm_sync_error_compensating_write_info_t_reason_set(long j, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar, String str);

    public static final native String realm_sync_error_t_c_original_file_path_key_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_c_original_file_path_key_set(long j, realm_sync_error_t realm_sync_error_tVar, String str);

    public static final native String realm_sync_error_t_c_recovery_file_path_key_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_c_recovery_file_path_key_set(long j, realm_sync_error_t realm_sync_error_tVar, String str);

    public static final native long realm_sync_error_t_compensating_writes_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native long realm_sync_error_t_compensating_writes_length_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_compensating_writes_length_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2);

    public static final native void realm_sync_error_t_compensating_writes_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2, realm_sync_error_compensating_write_info_t realm_sync_error_compensating_write_info_tVar);

    public static final native boolean realm_sync_error_t_is_client_reset_requested_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_is_client_reset_requested_set(long j, realm_sync_error_t realm_sync_error_tVar, boolean z);

    public static final native boolean realm_sync_error_t_is_fatal_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_is_fatal_set(long j, realm_sync_error_t realm_sync_error_tVar, boolean z);

    public static final native boolean realm_sync_error_t_is_unrecognized_by_client_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_is_unrecognized_by_client_set(long j, realm_sync_error_t realm_sync_error_tVar, boolean z);

    public static final native int realm_sync_error_t_server_requests_action_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_server_requests_action_set(long j, realm_sync_error_t realm_sync_error_tVar, int i);

    public static final native long realm_sync_error_t_status_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_status_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2, realm_error_t realm_error_tVar);

    public static final native long realm_sync_error_t_user_code_error_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_user_code_error_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2);

    public static final native long realm_sync_error_t_user_info_length_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_user_info_length_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2);

    public static final native long realm_sync_error_t_user_info_map_get(long j, realm_sync_error_t realm_sync_error_tVar);

    public static final native void realm_sync_error_t_user_info_map_set(long j, realm_sync_error_t realm_sync_error_tVar, long j2, realm_sync_error_user_info_t realm_sync_error_user_info_tVar);

    public static final native String realm_sync_error_user_info_t_key_get(long j, realm_sync_error_user_info_t realm_sync_error_user_info_tVar);

    public static final native void realm_sync_error_user_info_t_key_set(long j, realm_sync_error_user_info_t realm_sync_error_user_info_tVar, String str);

    public static final native String realm_sync_error_user_info_t_value_get(long j, realm_sync_error_user_info_t realm_sync_error_user_info_tVar);

    public static final native void realm_sync_error_user_info_t_value_set(long j, realm_sync_error_user_info_t realm_sync_error_user_info_tVar, String str);

    public static final native long realm_sync_find_subscription_by_name(long j, String str);

    public static final native long realm_sync_find_subscription_by_query(long j, long j2);

    public static final native long realm_sync_find_subscription_by_results(long j, long j2);

    public static final native long realm_sync_get_active_subscription_set(long j);

    public static final native long realm_sync_get_latest_subscription_set(long j);

    public static final native boolean realm_sync_immediately_run_file_actions(long j, String str, boolean[] zArr);

    public static final native long realm_sync_make_subscription_set_mutable(long j);

    public static final native boolean realm_sync_on_subscription_set_state_change_async(long j, int i, Object obj);

    public static final native int realm_sync_on_subscription_set_state_change_wait(long j, int i);

    public static final native void realm_sync_session_connection_state_change_callback(long j, int i, int i2);

    public static final native long realm_sync_session_get(long j);

    public static final native int realm_sync_session_get_connection_state(long j);

    public static final native void realm_sync_session_get_file_ident(long j, long j2, realm_salted_file_ident_t realm_salted_file_ident_tVar);

    public static final native String realm_sync_session_get_file_path(long j);

    public static final native String realm_sync_session_get_partition_value(long j);

    public static final native int realm_sync_session_get_state(long j);

    public static final native long realm_sync_session_get_user(long j);

    public static final native void realm_sync_session_handle_error_for_testing(long j, int i, String str, boolean z);

    public static final native void realm_sync_session_pause(long j);

    public static final native void realm_sync_session_progress_notifier_callback(long j, long j2, long j3, double d);

    public static final native long realm_sync_session_register_connection_state_change_callback(long j, Object obj);

    public static final native long realm_sync_session_register_progress_notifier(long j, long j2, int i, boolean z, long j3, long j4);

    public static final native long realm_sync_session_register_progress_notifier_wrapper(long j, int i, boolean z, Object obj);

    public static final native void realm_sync_session_resume(long j);

    public static final native void realm_sync_session_wait_for_download_completion(long j, Object obj);

    public static final native void realm_sync_session_wait_for_upload_completion(long j, Object obj);

    public static final native long realm_sync_socket_new(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9);

    public static final native void realm_sync_socket_post_complete(long j, int i, String str);

    public static final native void realm_sync_socket_timer_canceled(long j);

    public static final native void realm_sync_socket_timer_complete(long j, int i, String str);

    public static final native boolean realm_sync_socket_websocket_closed(long j, boolean z, int i, String str);

    public static final native void realm_sync_socket_websocket_connected(long j, String str);

    public static final native void realm_sync_socket_websocket_error(long j);

    public static final native boolean realm_sync_socket_websocket_message(long j, String str, long j2);

    public static final native void realm_sync_socket_write_complete(long j, int i, String str);

    public static final native long realm_sync_subscription_at(long j, long j2);

    public static final native long realm_sync_subscription_created_at(long j);

    public static final native long realm_sync_subscription_id(long j);

    public static final native String realm_sync_subscription_name(long j);

    public static final native String realm_sync_subscription_object_class_name(long j);

    public static final native String realm_sync_subscription_query_string(long j);

    public static final native boolean realm_sync_subscription_set_clear(long j);

    public static final native long realm_sync_subscription_set_commit(long j);

    public static final native boolean realm_sync_subscription_set_erase_by_class_name(long j, String str, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_erase_by_id(long j, long j2, realm_object_id_t realm_object_id_tVar, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_erase_by_name(long j, String str, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_erase_by_query(long j, long j2, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_erase_by_results(long j, long j2, boolean[] zArr);

    public static final native String realm_sync_subscription_set_error_str(long j);

    public static final native boolean realm_sync_subscription_set_insert_or_assign_query(long j, long j2, String str, long[] jArr, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_insert_or_assign_results(long j, long j2, String str, long[] jArr, boolean[] zArr);

    public static final native boolean realm_sync_subscription_set_refresh(long j);

    public static final native long realm_sync_subscription_set_size(long j);

    public static final native int realm_sync_subscription_set_state(long j);

    public static final native long realm_sync_subscription_set_version(long j);

    public static final native long realm_sync_subscription_updated_at(long j);

    public static final native void realm_sync_thread_created(long j);

    public static final native void realm_sync_thread_destroyed(long j);

    public static final native void realm_sync_thread_error(long j, String str);

    public static final native long realm_sync_user_on_state_change_register_callback(long j, long j2, long j3, long j4);

    public static final native void realm_sync_websocket_callback_complete(boolean z, long j, int i, String str);

    public static final native void realm_sync_websocket_closed(long j, boolean z, int i, String str);

    public static final native void realm_sync_websocket_connected(long j, String str);

    public static final native void realm_sync_websocket_error(long j);

    public static final native boolean realm_sync_websocket_message(long j, byte[] bArr, long j2);

    public static final native long realm_sync_websocket_new(long j, Object obj);

    public static final native int realm_timestamp_t_nanoseconds_get(long j, realm_timestamp_t realm_timestamp_tVar);

    public static final native void realm_timestamp_t_nanoseconds_set(long j, realm_timestamp_t realm_timestamp_tVar, int i);

    public static final native long realm_timestamp_t_seconds_get(long j, realm_timestamp_t realm_timestamp_tVar);

    public static final native void realm_timestamp_t_seconds_set(long j, realm_timestamp_t realm_timestamp_tVar, long j2);

    public static final native boolean realm_update_schema(long j, long j2);

    public static final native String realm_user_get_access_token(long j);

    public static final native boolean realm_user_get_all_identities(long j, long j2, realm_user_identity_t realm_user_identity_tVar, long j3, long[] jArr);

    public static final native long realm_user_get_app(long j);

    public static final native String realm_user_get_custom_data(long j);

    public static final native String realm_user_get_device_id(long j);

    public static final native String realm_user_get_identity(long j);

    public static final native String realm_user_get_profile_data(long j);

    public static final native String realm_user_get_refresh_token(long j);

    public static final native int realm_user_get_state(long j);

    public static final native String realm_user_identity_t_id_get(long j, realm_user_identity_t realm_user_identity_tVar);

    public static final native void realm_user_identity_t_id_set(long j, realm_user_identity_t realm_user_identity_tVar, String str);

    public static final native int realm_user_identity_t_provider_type_get(long j, realm_user_identity_t realm_user_identity_tVar);

    public static final native void realm_user_identity_t_provider_type_set(long j, realm_user_identity_t realm_user_identity_tVar, int i);

    public static final native boolean realm_user_is_logged_in(long j);

    public static final native boolean realm_user_log_out(long j);

    public static final native short[] realm_uuid_t_bytes_get(long j, realm_uuid_t realm_uuid_tVar);

    public static final native void realm_uuid_t_bytes_set(long j, realm_uuid_t realm_uuid_tVar, short[] sArr);

    public static final native boolean realm_value_t__boolean_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t__boolean_set(long j, realm_value_t realm_value_tVar, boolean z);

    public static final native long realm_value_t_binary_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_binary_set(long j, realm_value_t realm_value_tVar, long j2, realm_binary_t realm_binary_tVar);

    public static final native void realm_value_t_cleanup(long j, realm_value_t realm_value_tVar);

    public static final native String realm_value_t_data_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_data_set(long j, realm_value_t realm_value_tVar, String str);

    public static final native long realm_value_t_decimal128_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_decimal128_set(long j, realm_value_t realm_value_tVar, long j2, realm_decimal128_t realm_decimal128_tVar);

    public static final native double realm_value_t_dnum_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_dnum_set(long j, realm_value_t realm_value_tVar, double d);

    public static final native float realm_value_t_fnum_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_fnum_set(long j, realm_value_t realm_value_tVar, float f);

    public static final native long realm_value_t_integer_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_integer_set(long j, realm_value_t realm_value_tVar, long j2);

    public static final native long realm_value_t_link_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_link_set(long j, realm_value_t realm_value_tVar, long j2, realm_link_t realm_link_tVar);

    public static final native long realm_value_t_object_id_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_object_id_set(long j, realm_value_t realm_value_tVar, long j2, realm_object_id_t realm_object_id_tVar);

    public static final native String realm_value_t_string_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_string_set(long j, realm_value_t realm_value_tVar, String str);

    public static final native long realm_value_t_timestamp_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_timestamp_set(long j, realm_value_t realm_value_tVar, long j2, realm_timestamp_t realm_timestamp_tVar);

    public static final native int realm_value_t_type_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_type_set(long j, realm_value_t realm_value_tVar, int i);

    public static final native long realm_value_t_uuid_get(long j, realm_value_t realm_value_tVar);

    public static final native void realm_value_t_uuid_set(long j, realm_value_t realm_value_tVar, long j2, realm_uuid_t realm_uuid_tVar);

    public static final native long realm_version_id_t_index_get(long j, realm_version_id_t realm_version_id_tVar);

    public static final native void realm_version_id_t_index_set(long j, realm_version_id_t realm_version_id_tVar, long j2);

    public static final native long realm_version_id_t_version_get(long j, realm_version_id_t realm_version_id_tVar);

    public static final native void realm_version_id_t_version_set(long j, realm_version_id_t realm_version_id_tVar, long j2);

    public static final native String realm_websocket_endpoint_t_address_get(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar);

    public static final native void realm_websocket_endpoint_t_address_set(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar, String str);

    public static final native boolean realm_websocket_endpoint_t_is_ssl_get(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar);

    public static final native void realm_websocket_endpoint_t_is_ssl_set(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar, boolean z);

    public static final native long realm_websocket_endpoint_t_num_protocols_get(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar);

    public static final native void realm_websocket_endpoint_t_num_protocols_set(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar, long j2);

    public static final native String realm_websocket_endpoint_t_path_get(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar);

    public static final native void realm_websocket_endpoint_t_path_set(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar, String str);

    public static final native int realm_websocket_endpoint_t_port_get(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar);

    public static final native void realm_websocket_endpoint_t_port_set(long j, realm_websocket_endpoint_t realm_websocket_endpoint_tVar, int i);

    public static final native boolean realm_wrap_exceptions(long j);

    public static final native long register_notification_cb(long j, int i, long j2, Object obj);

    public static final native long register_results_notification_cb(long j, long j2, Object obj);

    public static final native void schema_changed_callback(long j, long j2);

    public static final native void set_log_callback(Object obj);

    public static final native void sync_after_client_reset_handler(long j, Object obj);

    public static final native void sync_before_client_reset_handler(long j, Object obj);

    public static final native void sync_set_error_handler(long j, Object obj);

    public static final native boolean throw_last_error_as_java_exception(long j);

    public static final native void transfer_completion_callback(long j, long j2, realm_error_t realm_error_tVar);

    public static final native long valueArray_getitem(long j, realm_value_t realm_value_tVar, int i);

    public static final native void valueArray_setitem(long j, realm_value_t realm_value_tVar, int i, long j2, realm_value_t realm_value_tVar2);
}

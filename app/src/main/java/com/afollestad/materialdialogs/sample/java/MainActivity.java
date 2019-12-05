package com.afollestad.materialdialogs.sample.java;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.afollestad.materialdialogs.LayoutMode;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.bottomsheets.BasicGridItem;
import com.afollestad.materialdialogs.bottomsheets.BottomSheet;
import com.afollestad.materialdialogs.bottomsheets.BottomSheetsKt;
import com.afollestad.materialdialogs.checkbox.DialogCheckboxExtKt;
import com.afollestad.materialdialogs.color.ColorPalette;
import com.afollestad.materialdialogs.color.DialogColorChooserExtKt;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.datetime.DatePickerExtKt;
import com.afollestad.materialdialogs.datetime.DateTimePickerExtKt;
import com.afollestad.materialdialogs.datetime.TimePickerExtKt;
import com.afollestad.materialdialogs.files.DialogFileChooserExtKt;
import com.afollestad.materialdialogs.files.DialogFolderChooserExtKt;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.list.DialogMultiChoiceExtKt;
import com.afollestad.materialdialogs.list.DialogSingleChoiceExtKt;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.TRANSPARENT;
import static android.os.Environment.getExternalStorageDirectory;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.basic).setOnClickListener(v -> {
			basic();
		});

		findViewById(R.id.basic_titled).setOnClickListener(v -> {
			basic_titled();
		});

		findViewById(R.id.basic_buttons).setOnClickListener(v -> {
			basic_buttons();
		});

		findViewById(R.id.basic_stacked_buttons).setOnClickListener(v -> {
			basic_stacked_buttons();
		});

		findViewById(R.id.basic_titled_buttons).setOnClickListener(v -> {
			basic_titled_buttons();
		});

		findViewById(R.id.basic_html_content).setOnClickListener(v -> {
			basic_html_content();
		});

		findViewById(R.id.basic_long_titled_buttons).setOnClickListener(v -> {
			basic_long_titled_buttons();
		});

		findViewById(R.id.basic_icon).setOnClickListener(v -> {
			basic_icon();
		});

		findViewById(R.id.basic_checkbox_titled_buttons).setOnClickListener(v -> {
			basic_checkbox_titled_buttons();
		});

		findViewById(R.id.list).setOnClickListener(v -> {
			list();
		});

		findViewById(R.id.list_buttons).setOnClickListener(v -> {
			list_buttons();
		});

		findViewById(R.id.list_dont_wait_positive).setOnClickListener(v -> {
			list_dont_wait_positive();
		});

		findViewById(R.id.list_titled).setOnClickListener(v -> {
			list_titled();
		});

		findViewById(R.id.list_titled_buttons).setOnClickListener(v -> {
			list_titled_buttons();
		});

		findViewById(R.id.list_titled_message_buttons).setOnClickListener(v -> {
			list_titled_message_buttons();
		});

		findViewById(R.id.list_long).setOnClickListener(v -> {
			list_long();
		});

		findViewById(R.id.list_long_titled).setOnClickListener(v -> {
			list_long_titled();
		});

		findViewById(R.id.list_checkPrompt_buttons).setOnClickListener(v -> {
			list_checkPrompt_buttons();
		});

		findViewById(R.id.single_choice_titled).setOnClickListener(v -> {
			single_choice_titled();
		});

		findViewById(R.id.single_choice_buttons_titled).setOnClickListener(v -> {
			single_choice_buttons_titled();
		});

		findViewById(R.id.single_choice_long_items).setOnClickListener(v -> {
			single_choice_long_items();
		});

		findViewById(R.id.single_choice_disabled_items).setOnClickListener(v -> {
			single_choice_disabled_items();
		});

		findViewById(R.id.multiple_choice).setOnClickListener(v -> {
			multiple_choice();
		});

		findViewById(R.id.multiple_choice_buttons).setOnClickListener(v -> {
			multiple_choice_buttons();
		});

		findViewById(R.id.multiple_choice_long_items).setOnClickListener(v -> {
			multiple_choice_long_items();
		});

		findViewById(R.id.multiple_choice_disabled_items).setOnClickListener(v -> {
			multiple_choice_disabled_items();
		});

		findViewById(R.id.buttons_stacked).setOnClickListener(v -> {
			buttons_stacked();
		});

		findViewById(R.id.buttons_stacked_checkboxPrompt).setOnClickListener(v -> {
			buttons_stacked_checkboxPrompt();
		});

		findViewById(R.id.buttons_neutral).setOnClickListener(v -> {
			buttons_neutral();
		});

		findViewById(R.id.buttons_callbacks).setOnClickListener(v -> {
			buttons_callbacks();
		});

		findViewById(R.id.misc_dialog_callbacks).setOnClickListener(v -> {
			misc_dialog_callbacks();
		});

		findViewById(R.id.input).setOnClickListener(v -> {
			input();
		});

		findViewById(R.id.input_message).setOnClickListener(v -> {
			input_message();
		});

		findViewById(R.id.input_counter).setOnClickListener(v -> {
			input_counter();
		});

		findViewById(R.id.input_check_prompt).setOnClickListener(v -> {
			input_check_prompt();
		});

		findViewById(R.id.custom_view).setOnClickListener(v -> {
			custom_view();
		});

		findViewById(R.id.custom_view_webview).setOnClickListener(v -> {
			custom_view_webview();
		});

		findViewById(R.id.colorChooser_primary).setOnClickListener(v -> {
			colorChooser_primary();
		});

		findViewById(R.id.colorChooser_accent).setOnClickListener(v -> {
			colorChooser_accent();
		});

		findViewById(R.id.colorChooser_customColors).setOnClickListener(v -> {
			colorChooser_customColors();
		});

		findViewById(R.id.colorChooser_customColorsNoSub).setOnClickListener(v -> {
			colorChooser_customColorsNoSub();
		});

		findViewById(R.id.colorChooser_primary_customRgb).setOnClickListener(v -> {
			colorChooser_primary_customRgb();
		});

		findViewById(R.id.colorChooser_primary_customArgb).setOnClickListener(v -> {
			colorChooser_primary_customArgb();
		});

		findViewById(R.id.file_chooser).setOnClickListener(v -> {
			file_chooser();
		});

		findViewById(R.id.file_chooser_buttons).setOnClickListener(v -> {
			file_chooser_buttons();
		});

		findViewById(R.id.file_chooser_filter).setOnClickListener(v -> {
			file_chooser_filter();
		});

		findViewById(R.id.folder_chooser_buttons).setOnClickListener(v -> {
			folder_chooser_buttons();
		});

		findViewById(R.id.folder_chooser_filter).setOnClickListener(v -> {
			folder_chooser_filter();
		});

		findViewById(R.id.date_picker).setOnClickListener(v -> {
			date_picker();
		});

		findViewById(R.id.time_picker).setOnClickListener(v -> {
			time_picker();
		});

		findViewById(R.id.datetime_picker).setOnClickListener(v -> {
			datetime_picker();
		});

		findViewById(R.id.bottomsheet_info).setOnClickListener(v -> {
			bottomsheet_info();
		});

		findViewById(R.id.bottomsheet_list).setOnClickListener(v -> {
			bottomsheet_list();
		});

		findViewById(R.id.bottomsheet_grid).setOnClickListener(v -> {
			bottomsheet_grid();
		});

		findViewById(R.id.bottomsheet_customView).setOnClickListener(v -> {
			bottomsheet_customView();
		});

		findViewById(R.id.bottomsheet_colorPicker).setOnClickListener(v -> {
			bottomsheet_colorPicker();
		});

		findViewById(R.id.bottomsheet_dateTimePicker).setOnClickListener(v -> {
			bottomsheet_dateTimePicker();
		});
	}

	private void basic() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.message(R.string.shareLocationPrompt, null, null);
		dialog.show();
	}

	private void basic_titled() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.show();
	}

	private void basic_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_stacked_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_titled_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_html_content() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.htmlContent, null, dialogMessageSettings -> {
			dialogMessageSettings.lineSpacing(1.4f);
			dialogMessageSettings.html(link -> {
				LinkMovementMethod.getInstance();
				Toast.makeText(this, "Clicked link: " + link, Toast.LENGTH_SHORT).show();
				return null;
			});
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_long_titled_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.loremIpsum, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_icon() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.icon(R.mipmap.ic_launcher, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	private void basic_checkbox_titled_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		DialogCheckboxExtKt.checkBoxPrompt(dialog, R.string.checkboxConfirm, null, false, isChecked -> {
			Toast.makeText(this, "checked? " + isChecked, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, false, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			dialog.dismiss();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_dont_wait_positive() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, false, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			dialog.dismiss();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_titled() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, false, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			dialog.dismiss();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_titled_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_titled_message_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		dialog.message(R.string.useGoogleLocationServices, null, null);
		DialogListExtKt.listItems(dialog, R.array.socialNetworks, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_long() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		DialogListExtKt.listItems(dialog, R.array.states, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_long_titled() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.states, null);
		DialogListExtKt.listItems(dialog, R.array.states, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void list_checkPrompt_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogListExtKt.listItems(dialog, R.array.socialNetworks_longItems, null, null,
				true, (materialDialog, index, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
					return null;
				});
		DialogCheckboxExtKt.checkBoxPrompt(dialog, R.string.checkboxConfirm, null, false, isChecked -> {
			Toast.makeText(this, "checked? " + isChecked, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void single_choice_titled() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogSingleChoiceExtKt.listItemsSingleChoice(dialog, R.array.socialNetworks, null, null, 1,
				false, (materialDialog, index, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void single_choice_buttons_titled() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogSingleChoiceExtKt.listItemsSingleChoice(dialog, R.array.socialNetworks, null, null, 2,
				true, (materialDialog, index, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void single_choice_long_items() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogSingleChoiceExtKt.listItemsSingleChoice(dialog, R.array.socialNetworks_longItems, null, null, 0,
				true, (materialDialog, index, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void single_choice_disabled_items() {
		int[] disabledIndices = {1, 3};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogSingleChoiceExtKt.listItemsSingleChoice(dialog, R.array.socialNetworks, null, disabledIndices, 0,
				true, (materialDialog, index, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void multiple_choice() {
		int[] initialSelection = {1, 3};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogMultiChoiceExtKt.listItemsMultiChoice(dialog, R.array.socialNetworks, null, null, initialSelection,
				true, false, (materialDialog, indices, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at indices " + indices.length, Toast.LENGTH_SHORT).show();
					dialog.dismiss();
					return null;
				});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void multiple_choice_buttons() {
		int[] initialSelection = {1, 3};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogMultiChoiceExtKt.listItemsMultiChoice(dialog, R.array.socialNetworks, null, null, initialSelection,
				true, false, (materialDialog, indices, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at indices " + indices.length, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void multiple_choice_long_items() {
		int[] initialSelection = {0, 2};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogMultiChoiceExtKt.listItemsMultiChoice(dialog, R.array.socialNetworks_longItems, null, null, initialSelection,
				true, false, (materialDialog, indices, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at indices " + indices.length, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void multiple_choice_disabled_items() {
		int[] initialSelection = {2, 3};
		int[] disabledIndices = {1, 3};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.socialNetworks, null);
		DialogMultiChoiceExtKt.listItemsMultiChoice(dialog, R.array.socialNetworks, null, disabledIndices, initialSelection,
				true, false, (materialDialog, indices, text) -> {
					Toast.makeText(this, "Selected item  " + text + " at indices " + indices.length, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.choose, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.choose), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void buttons_stacked() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(null, "Hello World", materialDialog -> {
			Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(null, "How are you doing?", materialDialog -> {
			Toast.makeText(this, "How are you doing?", Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.neutralButton(null, "Testing long buttons", materialDialog -> {
			Toast.makeText(this, "Testing long buttons", Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void buttons_stacked_checkboxPrompt() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(null, "Hello World", materialDialog -> {
			Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(null, "How are you doing?", materialDialog -> {
			Toast.makeText(this, "How are you doing?", Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.neutralButton(null, "Testing long buttons", materialDialog -> {
			Toast.makeText(this, "Testing long buttons", Toast.LENGTH_SHORT).show();
			return null;
		});
		DialogCheckboxExtKt.checkBoxPrompt(dialog, R.string.checkboxConfirm, null, false, isChecked -> {
			Toast.makeText(this, "checked? " + isChecked, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void buttons_neutral() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.neutralButton(R.string.more_info, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.more_info), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void buttons_callbacks() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.neutralButton(R.string.more_info, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.more_info), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void misc_dialog_callbacks() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.setOnShowListener(onShowListener -> {
			Toast.makeText(MainActivity.this, "onShow", Toast.LENGTH_SHORT).show();
		});
		dialog.setOnCancelListener(onCancelListener -> {
			Toast.makeText(MainActivity.this, "onCancel", Toast.LENGTH_SHORT).show();
		});
		dialog.setOnDismissListener(onDismissListener -> {
			Toast.makeText(MainActivity.this, "onDismiss", Toast.LENGTH_SHORT).show();
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void input() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		DialogInputExtKt.input(dialog, "Type something", null, null, null,
				InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS ,
				null, true, false, (materialDialog, text) -> {
					Toast.makeText(this, "Input  " + text, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void input_message() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		DialogInputExtKt.input(dialog, "Type something", null, null, null,
				InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS ,
				null, true, false, (materialDialog, text) -> {
					Toast.makeText(this, "Input  " + text, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void input_counter() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		DialogInputExtKt.input(dialog, "Type something", null, null, null,
				InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS ,
				8, true, false, (materialDialog, text) -> {
					Toast.makeText(this, "Input  " + text, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void input_check_prompt() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		DialogInputExtKt.input(dialog, "Type something", null, null, null,
				InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_WORDS ,
				null, true, false, (materialDialog, text) -> {
					Toast.makeText(this, "Input  " + text, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		DialogCheckboxExtKt.checkBoxPrompt(dialog, R.string.checkboxConfirm, null, false, isChecked -> {
			Toast.makeText(this, "checked? " + isChecked, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void custom_view() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.googleWifi, null);
		DialogCustomViewExtKt.customView(dialog, R.layout.custom_view, null,
				true, false, true, false);
		dialog.positiveButton(R.string.connect, null, materialDialog -> {
			EditText passwordInput = materialDialog.getView().findViewById(R.id.password);
			Toast.makeText(this, "Password: " + passwordInput.getText(), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();

		View customView = DialogCustomViewExtKt.getCustomView(dialog);
		EditText passwordInput = customView.findViewById(R.id.password);
		CheckBox showPasswordCheck = customView.findViewById(R.id.showPassword);
		showPasswordCheck.setOnCheckedChangeListener((compoundButton,  checked) -> {
			if (!checked) {
				passwordInput.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
				passwordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
			}
			else {
				passwordInput.setInputType(InputType.TYPE_CLASS_TEXT);
				passwordInput.setTransformationMethod(null);
			}
		});
	}

	@SuppressLint("CheckResult")
	private void custom_view_webview() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		DialogCustomViewExtKt.customView(dialog, R.layout.custom_view_webview, null,
				false, true, false, false);
		dialog.setOnShowListener(onShowListener -> {
			WebView webView = DialogCustomViewExtKt.getCustomView(dialog).findViewById(R.id.web_view);
			webView.loadData(
					"<h3>WebView Custom View</h3>\n" +
							"\n" +
							"<ol>\n" +
							"    <li><b>NEW:</b> Hey!</li>\n" +
							"    <li><b>IMPROVE:</b> Hello!</li>\n" +
							"    <li><b>FIX:</b> Hi!</li>\n" +
							"    <li><b>FIX:</b> Hey again!</li>\n" +
							"    <li><b>FIX:</b> What?</li>\n" +
							"    <li><b>FIX:</b> This is an example.</li>\n" +
							"    <li><b>MISC:</b> How are you?</li>\n" +
							"</ol>\n" +
							"<p>Material guidelines for dialogs:\n" +
							"    <a href='http://www.google.com/design/spec/components/dialogs.html'>" +
							"http://www.google.com/design/spec/components/dialogs.html</a>.\n" +
							"</p>",
					"text/html",
					"UTF-8");
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_primary() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, ColorPalette.INSTANCE.getPrimary(), ColorPalette.INSTANCE.getPrimarySub(),
				null, true, false, false, false,
				(materialDialog, color) -> {
					Toast.makeText(this, "Selected color: " + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_accent() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, ColorPalette.INSTANCE.getAccent(), ColorPalette.INSTANCE.getAccentSub(),
				null, true, false, false, false,
				(materialDialog, color) -> {
					Toast.makeText(this, "Selected color: " + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_customColors() {
		int[] topLevel = {TRANSPARENT, Color.RED, Color.YELLOW, Color.BLUE};
		int[][] subLevel = {
				{Color.WHITE, TRANSPARENT, Color.BLACK},
				{Color.LTGRAY, Color.GRAY, Color.DKGRAY},
				{Color.GREEN},
				{Color.MAGENTA, Color.CYAN}
		};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, topLevel, subLevel,
				null, true, false, false, false,
				(materialDialog, color) -> {
					String colorStr;
					if (color == TRANSPARENT) colorStr="transparent";
					else colorStr=Integer.toHexString(color);
					Toast.makeText(this, "Selected color: " + colorStr, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_customColorsNoSub() {
		int[] topLevel = {Color.RED, Color.YELLOW, Color.BLUE};

		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, topLevel, null,
				null, true, false, false, false,
				(materialDialog, color) -> {
					Toast.makeText(this, "Selected color: " + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_primary_customRgb() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, ColorPalette.INSTANCE.getPrimary(), ColorPalette.INSTANCE.getPrimarySub(),
				null, true, true, false, false,
				(materialDialog, color) -> {
					Toast.makeText(this, "Selected color: " + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void colorChooser_primary_customArgb() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogColorChooserExtKt.colorChooser(dialog, ColorPalette.INSTANCE.getPrimary(), ColorPalette.INSTANCE.getPrimarySub(),
				null, true, true, true, false,
				(materialDialog, color) -> {
					Toast.makeText(this, "Selected color: " + Integer.toHexString(color), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void file_chooser() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogFileChooserExtKt.fileChooser(dialog, getExternalStorageDirectory(), null,
				true, R.string.files_default_empty_text, false, null,
				(materialDialog, file) -> {
					Toast.makeText(this, "Selected file: " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void file_chooser_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogFileChooserExtKt.fileChooser(dialog, getExternalStorageDirectory(), null,
				true, R.string.files_default_empty_text, true, null,
				(materialDialog, file) -> {
					Toast.makeText(this, "Selected file: " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void file_chooser_filter() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogFileChooserExtKt.fileChooser(dialog, getExternalStorageDirectory(), file -> {
					return (file.getName().endsWith("txt"));
				},
				true, R.string.files_default_empty_text, true, null,
				(materialDialog, file) -> {
					Toast.makeText(this, "Selected file: " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void folder_chooser_buttons() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogFolderChooserExtKt.folderChooser(dialog, getExternalStorageDirectory(), null,
				true, R.string.files_default_empty_text, true, null,
				(materialDialog, file) -> {
					Toast.makeText(this, "Selected file: " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void folder_chooser_filter() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DialogFolderChooserExtKt.folderChooser(dialog, getExternalStorageDirectory(), file -> {
					return (file.getName().contains("a"));
				},
				true, R.string.files_default_empty_text, true, null,
				(materialDialog, file) -> {
					Toast.makeText(this, "Selected file: " + file.getAbsolutePath(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void date_picker() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(R.string.primary_colors, null);
		DatePickerExtKt.datePicker(dialog, null, null,
				null, false,
				(materialDialog, date) -> {
					Toast.makeText(this, "Selected date: " + date.getTime(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void time_picker() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(null, "Select Time");
		TimePickerExtKt.timePicker(dialog, null, false, true,
				(materialDialog, time) -> {
					Toast.makeText(this, "Selected time: " + time.getTime(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void datetime_picker() {
		MaterialDialog dialog = new MaterialDialog(this, MaterialDialog.getDEFAULT_BEHAVIOR());
		dialog.title(null, "Select Date and Time");
		DateTimePickerExtKt.dateTimePicker(dialog, null, null, false,
				false, true,
				(materialDialog, dateTime) -> {
					Toast.makeText(this, "Selected date/time: " + dateTime.getTime(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_info() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);
		dialog.title(R.string.useGoogleLocationServices, null);
		dialog.message(R.string.useGoogleLocationServicesPrompt, null, null);
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_list() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);
		DialogListExtKt.listItems(dialog, R.array.states, null, null, true, (materialDialog, index, text) -> {
			Toast.makeText(this, "Selected item  " + text + " at index " + index, Toast.LENGTH_SHORT).show();
			dialog.dismiss();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_grid() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);

		List<BasicGridItem> items = new ArrayList<>();
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "One"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "One"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Two"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Three"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Four"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Five"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Six"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Seven"));
		items.add(new BasicGridItem(R.drawable.ic_icon_android, "Eight"));

		BottomSheetsKt.gridItems(dialog, items, null, null, true, (materialDialog, index, item) -> {
			Toast.makeText(this, "Selected item  " + item.getTitle() + " at index " + index, Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.positiveButton(R.string.agree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.agree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(R.string.disagree, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.disagree), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_customView() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);
		dialog.title(R.string.googleWifi, null);
		DialogCustomViewExtKt.customView(dialog, R.layout.custom_view, null,
				true, false, true, false);
		dialog.positiveButton(R.string.connect, null, materialDialog -> {
			EditText passwordInput = materialDialog.getView().findViewById(R.id.password);
			Toast.makeText(this, "Password: " + passwordInput.getText(), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();

		View customView = DialogCustomViewExtKt.getCustomView(dialog);
		EditText passwordInput = customView.findViewById(R.id.password);
		CheckBox showPasswordCheck = customView.findViewById(R.id.showPassword);
		showPasswordCheck.setOnCheckedChangeListener((compoundButton,  checked) -> {
			if (!checked) {
				passwordInput.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
				passwordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
			}
			else {
				passwordInput.setInputType(InputType.TYPE_CLASS_TEXT);
				passwordInput.setTransformationMethod(null);
			}
		});
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_colorPicker() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);
		dialog.title(R.string.custom_colors_argb, null);
		DialogColorChooserExtKt.colorChooser(dialog, ColorPalette.INSTANCE.getPrimary(), ColorPalette.INSTANCE.getPrimarySub(),
				null, true, true, true, false,
				(materialDialog, color) -> {
					String colorStr;
					if (color == TRANSPARENT) colorStr="transparent";
					else colorStr=Integer.toHexString(color);
					Toast.makeText(this, "Selected color: " + colorStr, Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}

	@SuppressLint("CheckResult")
	private void bottomsheet_dateTimePicker() {
		BottomSheet bottomSheet = new BottomSheet(LayoutMode.WRAP_CONTENT);
		MaterialDialog dialog = new MaterialDialog(this, bottomSheet);
		dialog.title(null, "Select Date and Time");
		DateTimePickerExtKt.dateTimePicker(dialog, null, null, false,
				false, true,
				(materialDialog, dateTime) -> {
					Toast.makeText(this, "Selected date/time: " + dateTime.getTime(), Toast.LENGTH_SHORT).show();
					return null;
				});
		dialog.positiveButton(R.string.select, null, materialDialog -> {
			Toast.makeText(this, getText(R.string.select), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.negativeButton(android.R.string.cancel, null, materialDialog -> {
			Toast.makeText(this, getText(android.R.string.cancel), Toast.LENGTH_SHORT).show();
			return null;
		});
		dialog.show();
	}
}

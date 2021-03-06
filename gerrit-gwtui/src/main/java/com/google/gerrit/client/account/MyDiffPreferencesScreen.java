// Copyright (C) 2015 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.client.account;

import com.google.gerrit.client.Gerrit;
import com.google.gerrit.client.diff.PreferencesBox;
import com.google.gwt.user.client.ui.FlowPanel;

public class MyDiffPreferencesScreen extends SettingsScreen {

  @Override
  protected void onInitUI() {
    super.onInitUI();

    PreferencesBox pb = new PreferencesBox(null);
    pb.set(DiffPreferences.create(Gerrit.getAccountDiffPreference()));
    FlowPanel p = new FlowPanel();
    p.setStyleName(pb.getStyle().dialog());
    p.add(pb);
    add(p);
  }

  @Override
  protected void onLoad() {
    super.onLoad();
    display();
  }
}

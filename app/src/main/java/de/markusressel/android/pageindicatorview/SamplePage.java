/*
 * Copyright (c) 2016 Markus Ressel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.markusressel.android.pageindicatorview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Markus on 10.11.2016.
 */

public class SamplePage extends Fragment {

    private static final String KEY_TITLE = "title";
    private String titleText;

    public static SamplePage newInstance(String title) {
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, title);

        SamplePage fragment = new SamplePage();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sample_page, container, false);

        TextView title = (TextView) rootView.findViewById(R.id.title);

        Bundle args = getArguments();
        if (args != null && args.containsKey(KEY_TITLE)) {
            titleText = args.getString(KEY_TITLE);
        }

        title.setText(titleText);

        return rootView;
    }

}
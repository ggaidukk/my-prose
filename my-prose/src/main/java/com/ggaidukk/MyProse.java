/*
 * Copyright (C) 2025 Yelyzaveta 
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */


package com.ggaidukk;

import de.htw_berlin.fb4.ossd.prose.Prose;

public class MyProse implements Prose {
    private String text = "Das ist ein einfacher Prose-Text";

    @Override
    public String get() {
        return text;
    }
}

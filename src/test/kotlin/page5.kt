/*
static uiWindow *parent

static void openFile(uiButton *b, void *data)
{
	char *fn

	fn = uiOpenFile(parent)
	if (fn == NULL)
		uiLabelSetText(uiLabel(data), "(cancelled)")
	else {
		uiLabelSetText(uiLabel(data), fn)
		uiFreeText(fn)
	}
}

static void saveFile(uiButton *b, void *data)
{
	char *fn

	fn = uiSaveFile(parent)
	if (fn == NULL)
		uiLabelSetText(uiLabel(data), "(cancelled)")
	else {
		uiLabelSetText(uiLabel(data), fn)
		uiFreeText(fn)
	}
}

static uiEntry *title, *description

static void msgBox(uiButton *b, void *data)
{
	char *t, *d

	t = uiEntryText(title)
	d = uiEntryText(description)
	uiMsgBox(parent, t, d)
	uiFreeText(d)
	uiFreeText(t)
}

static void msgBoxError(uiButton *b, void *data)
{
	char *t, *d

	t = uiEntryText(title)
	d = uiEntryText(description)
	uiMsgBoxError(parent, t, d)
	uiFreeText(d)
	uiFreeText(t)
}

uiBox *makePage5(uiWindow *pw)
{
	uiBox *page5
	uiBox *hbox
	uiButton *button
	uiLabel *label

	parent = pw

	page5 = newVerticalBox()

#define D(n, f) \
	hbox = newHorizontalBox() \
	button = uiNewButton(n) \
	label = uiNewLabel("") \
	uiButtonOnClicked(button, f, label) \
	uiBoxAppend(hbox, button?.reinterpret(), 0) \
	uiBoxAppend(hbox, label?.reinterpret(), 0) \
	uiBoxAppend(page5, hbox?.reinterpret(), 0)

	D("Open File", openFile)
	D("Save File", saveFile)

	title = uiNewEntry()
	uiEntrySetText(title, "Title")
	description = uiNewEntry()
	uiEntrySetText(description, "Description")

	hbox = newHorizontalBox()
	button = uiNewButton("Message Box")
	uiButtonOnClicked(button, msgBox, NULL)
	uiBoxAppend(hbox, button?.reinterpret(), 0)
	uiBoxAppend(hbox, title?.reinterpret(), 0)
	uiBoxAppend(page5, hbox?.reinterpret(), 0)

	hbox = newHorizontalBox()
	button = uiNewButton("Error Box")
	uiButtonOnClicked(button, msgBoxError, NULL)
	uiBoxAppend(hbox, button?.reinterpret(), 0)
	uiBoxAppend(hbox, description?.reinterpret(), 0)
	uiBoxAppend(page5, hbox?.reinterpret(), 0)

	return page5
}
*/
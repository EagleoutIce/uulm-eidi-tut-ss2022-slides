PREVIEW_TEX := $(shell ls c*.tex)
PDFS        := $(addsuffix .pdf,$(basename ${PREVIEW_TEX}))
all: $(PDFS)

%.pdf: overview.tex
	@echo "$*.tex"
	sltx raw-compile "$*.tex"
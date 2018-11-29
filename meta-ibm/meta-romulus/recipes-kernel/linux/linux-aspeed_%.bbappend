FILESEXTRAPATHS_prepend_romulus := "${THISDIR}/${PN}:"
SRC_URI += "file://romulus.cfg"
SRC_URI += "file://0001-romulus-lm75-led-kvm-eeprom.patch"

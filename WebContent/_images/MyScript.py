from PIL import Image
import os
import json

rootdir = "."
allSlices = []
imageUrlKeys = {}
sliceKeys = {}

for dir, subdir, file in os.walk(rootdir):
    for fname in file:
        if fname.endswith(".jpg") or fname.endswith(".png"):
            njain = os.path.join(dir, fname)
            img = Image.open(njain)
            path = str(os.path.normpath(njain))
            imageUrlKeys[fname[:-4]] = {"url": path.replace('\\','/'), "preload": "main-scene"}
            sliceKeys[fname[:-4]] = {"image": fname[:-4], "size": img.size}

resourceKey = {"resources": {"images": imageUrlKeys, "slices": sliceKeys}}
f = open("images.json", "w")
f.write(json.dumps(resourceKey))
f.close()
print str("Operation Successful!")


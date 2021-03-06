#!/usr/bin/env python

from setuptools import setup, find_packages

setup(
    name="hailjwt",
    version='0.0.1',
    author="Hail Team",
    author_email="hail-team@broadinstitute.org",
    description="Hail JWT utilities",
    long_description="",
    long_description_content_type="text/markdown",
    url="https://hail.is",
    packages=find_packages(),
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
    ],
    python_requires=">=3.6",
    install_requires=[
        'PyJWT>=1.7,<2'
    ]
)

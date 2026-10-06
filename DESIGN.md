---
name: Modern Operational Precision
colors:
  surface: '#f8f9ff'
  surface-dim: '#cbdbf5'
  surface-bright: '#f8f9ff'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#eff4ff'
  surface-container: '#e5eeff'
  surface-container-high: '#dce9ff'
  surface-container-highest: '#d3e4fe'
  on-surface: '#0b1c30'
  on-surface-variant: '#434655'
  inverse-surface: '#213145'
  inverse-on-surface: '#eaf1ff'
  outline: '#747686'
  outline-variant: '#c4c5d7'
  surface-tint: '#2151da'
  primary: '#0037b0'
  on-primary: '#ffffff'
  primary-container: '#1d4ed8'
  on-primary-container: '#cad3ff'
  inverse-primary: '#b7c4ff'
  secondary: '#565e74'
  on-secondary: '#ffffff'
  secondary-container: '#dae2fd'
  on-secondary-container: '#5c647a'
  tertiary: '#003ca3'
  on-tertiary: '#ffffff'
  tertiary-container: '#0051d6'
  on-tertiary-container: '#c9d4ff'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#dce1ff'
  primary-fixed-dim: '#b7c4ff'
  on-primary-fixed: '#001551'
  on-primary-fixed-variant: '#0039b5'
  secondary-fixed: '#dae2fd'
  secondary-fixed-dim: '#bec6e0'
  on-secondary-fixed: '#131b2e'
  on-secondary-fixed-variant: '#3f465c'
  tertiary-fixed: '#dbe1ff'
  tertiary-fixed-dim: '#b4c5ff'
  on-tertiary-fixed: '#00174b'
  on-tertiary-fixed-variant: '#003ea8'
  background: '#f8f9ff'
  on-background: '#0b1c30'
  surface-variant: '#d3e4fe'
typography:
  display-stat:
    fontFamily: Plus Jakarta Sans
    fontSize: 48px
    fontWeight: '700'
    lineHeight: 52px
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 32px
    fontWeight: '700'
    lineHeight: 40px
  headline-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  headline-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 18px
    fontWeight: '600'
    lineHeight: 24px
  body-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  body-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
  body-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 16px
  label-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 13px
    fontWeight: '600'
    lineHeight: 16px
  label-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 11px
    fontWeight: '600'
    lineHeight: 14px
  code-metric:
    fontFamily: JetBrains Mono
    fontSize: 14px
    fontWeight: '500'
    lineHeight: 20px
  code-metric-sm:
    fontFamily: JetBrains Mono
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 16px
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  gutter: 1.5rem
  gutter-desktop: 1.5rem
  margin: 1.5rem
  margin-desktop: 2.5rem
  space-xs: 0.25rem
  space-sm: 0.5rem
  space-md: 1rem
  space-lg: 1.5rem
  space-xl: 2rem
---

## Brand & Style

The design system establishes a high-clarity operational dashboard aesthetic centered on situational urgency rather than passive ticketing. Engineered for fast-paced campus resource centers, university advisement clinics, and modern student hubs, the interface minimizes mental fatigue under pressure.

### Aesthetic Principles
- **Clarity over Decoration:** Zero decorative fluff, high-contrast typography, and purposeful whitespace that exposes critical queue telemetry at a glance.
- **Triage-First Hierarchy:** Dynamic states rely on unmistakable semantic priority signaling rather than passive data displays.
- **Hackathon-Winner Precision:** Crisp card compositions, responsive micro-interactions, distinct categorical chips, and refined modern metric displays replace archaic spreadsheet tables.
- **Tone:** Decisive, intelligent, reassuring, and rigorously engineered.

## Colors

The palette pairs a cool slate foundation with sharp, unambiguous primary actions and distinct triage indicators.

### Palette Architecture
- **Canvas & Surface:**
  - Base Canvas: `#F8FAFC` (Cool slate tint)
  - Surface Container / Cards: `#FFFFFF` (Crisp pure white)
  - Subdued / Hover Surface: `#F1F5F9`
  - Subtle Dividing Border: `#E2E8F0`
- **Text & Hierarchy:**
  - Primary Text: `#0F172A` (Deep navy slate)
  - Secondary / Supporting: `#1E293B`
  - Muted / Metadata: `#64748B`
- **Primary & Interaction:**
  - Brand Primary: `#1D4ED8` (Deep electric royal blue)
  - Interactive Accent / Focus: `#2563EB`
  - Active Surface Wash: `#EFF6FF`
- **Operational Priority Engine:**
  - High Priority (Critical / Urgent): `#EF4444` (Surface wash: `#FEF2F2`, Border: `#FCA5A5`)
  - Medium Priority (Elevated / Approaching SLA): `#F59E0B` (Surface wash: `#FFFBEB`, Border: `#FCD34D`)
  - Normal Priority (Stable / Scheduled): `#10B981` (Surface wash: `#ECFDF5`, Border: `#6EE7B7`)

Avoid full-bleed high-saturation backgrounds on large cards; semantic status is conveyed through crisp 3px status rails, high-contrast badges, and light tinted status washes.

## Typography

Typography prioritizes scannability, vertical cadence, and immediate reading of queue numbers and timer metrics.

- **Primary Typeface:** `Plus Jakarta Sans` delivers a clean, modern aesthetic with geometric clarity and humanist legibility.
- **Metric & Time Typeface:** `JetBrains Mono` handles all numerical tracking, wait clocks, student identifiers, and desk codes to guarantee character alignment and prevent layout shifting during real-time updates.
- **Telemetry Display:** `display-stat` is reserved exclusively for primary throughput counters, peak wait times, and active queue counts.

## Layout & Spacing

The layout model is anchored by an adaptive 12-column responsive grid engineered for dense, real-time desktop monitoring while preserving expansive breathing room.

### Layout Rules
- **Desktop Grid:** 12-column system, 24px (`gutter-desktop`) column gaps, and 40px outer margins.
- **Workspace Partitioning:** 
  - Left persistent navigation rail (72px collapsed / 240px expanded).
  - Main operational board divided into a 2-column triage split (e.g., active queue stream spanning 8 columns, live metric & fast-action drawer spanning 4 columns).
- **Rhythm & Padding:** Component content strictly aligns to multiples of 4px and 8px. Card interior spacing is standardized at `space-lg` (24px) for metric overview cards and `space-md` (16px) for itemized queue cards.

## Elevation & Depth

Visual hierarchy uses clean white structural cards over a cool `#F8FAFC` base, supported by delicate multi-layered ambient shadows and hairline borders. Heavy borders and murky drops are strictly avoided.

### Shadow Specifications
- **Level 0 (Flat / Canvas):** None. Elements rely on `#E2E8F0` 1px borders.
- **Level 1 (Default Queue Cards & Metric Blocks):** 
  `box-shadow: 0 1px 3px 0 rgba(15, 23, 42, 0.04), 0 1px 2px -1px rgba(15, 23, 42, 0.03); border: 1px solid #E2E8F0;`
- **Level 2 (Hover & Active Drag Cards):** 
  `box-shadow: 0 10px 15px -3px rgba(15, 23, 42, 0.06), 0 4px 6px -4px rgba(15, 23, 42, 0.04); border-color: #CBD5E1;`
- **Level 3 (Modals, Dispatch Trays & Drawers):** 
  `box-shadow: 0 20px 25px -5px rgba(15, 23, 42, 0.08), 0 8px 10px -6px rgba(15, 23, 42, 0.04);`

Cards utilize 1px solid boundary rings rather than floating shadows alone to sustain an ultra-sharp, tactile finish.

## Shapes

The design uses an intentional, structured shape scale where cards align directly with modern, friendly campus product architecture.

- **Queue & Metric Cards:** Standard 16px radius (`rounded-lg` under Level 2 setting) to deliver a modern, approachable feel.
- **Interactive Controls (Buttons, Inputs):** 8px radius (`0.5rem`) to maintain functional discipline and distinguish active micro-elements from surrounding content cards.
- **Badges, Tags & Priority Indicators:** Full-pill radius (`9999px`) to create clear separation between data labels and interactive action targets.

## Components

### Buttons
- **Primary:** Solid `#1D4ED8` background, `#FFFFFF` text, 8px border-radius, font-weight 600. Hover: `#2563EB` with subtle 2px Y-translation.
- **Secondary:** Surface `#FFFFFF`, border `1px solid #E2E8F0`, text `#1E293B`. Hover: `#F8FAFC`, border `#CBD5E1`.
- **Urgent Action (Dispatch / Intervene):** Tinted `#FEF2F2` background, text `#EF4444`, border `1px solid #FCA5A5`.

### Queue Cards (Replaces Generic Data Tables)
- Cards sport a 16px corner radius, `#FFFFFF` background, and a left 4px priority indicator rail (Crimson, Amber, or Emerald).
- Prominent queue token identifier (e.g., `#A-104`) set in bold `JetBrains Mono`.
- Sub-elements include user role avatar/initials, dynamic wait timer pill with live progression fill, and quick-action icon buttons (Call Next, Reassign, Escalate).

### Priority Chips & Badges
- Pill-shaped (`rounded-full`), padding `2px 10px`, font size 11px uppercase `JetBrains Mono` or 12px `Plus Jakarta Sans` semi-bold.
- **High:** Text `#991B1B`, Background `#FEF2F2`, Border `#FCA5A5`. Accompanied by a pulsing 6px warning dot.
- **Medium:** Text `#92400E`, Background `#FFFBEB`, Border `#FCD34D`.
- **Normal:** Text `#065F46`, Background `#ECFDF5`, Border `#6EE7B7`.

### Input & Search Fields
- Minimalist height (40px desktop), `#FFFFFF` fill, 8px radius, border `1px solid #E2E8F0`, text `#0F172A`.
- Active focus state: border `#2563EB`, outer ring `3px solid rgba(37, 99, 235, 0.15)`, transition 150ms ease.

### Metric KPI Tiles
- Pure white container, 16px radius, subtle border.
- Layout: Small uppercase muted category label (`label-sm`), underneath an oversized numerical stat (`display-stat`), paired with an SLA delta percentage badge in the top-right corner.